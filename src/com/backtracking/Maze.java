package com.backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(pathCount(3,3));
//        path("",3,3);
//        System.out.println(pathList("",3,3));
//        System.out.println(pathListDiagonal("",3,3));

        boolean[][] maaze = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };

        pathObstacle("",maaze,0,0);
    }

    static int pathCount(int r, int c){
        if (r == 1 || c == 1){
            return 1;
        }
        int down = pathCount(r - 1, c);
        int right = pathCount(r, c - 1);
        return down + right;
    }

    static void path(String p, int r, int c){
        if (r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if (r > 1){
            path(p + "D", r - 1, c);
        }

        if (c > 1){
            path(p + "R", r, c - 1);
        }
    }

    static ArrayList<String> pathList(String p, int r, int c){
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1){
            list.addAll(pathList(p + "D", r - 1, c));
        }
        if (c > 1){
            list.addAll(pathList(p + "R", r, c - 1));
        }
        return list;
    }

    static ArrayList<String> pathListDiagonal(String p, int r, int c){
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1 && c > 1){
            list.addAll(pathListDiagonal(p + "D", r - 1, c - 1));
        }

        if (r > 1){
            list.addAll(pathListDiagonal(p + "V", r - 1, c));
        }

        if (c > 1){
            list.addAll(pathListDiagonal(p + "H", r, c - 1));
        }

        return list;
    }

    static void pathObstacle(String p, boolean[][] maze, int r, int c){
        if (r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }
        if (!maze[r][c])
            return;
        if (r < maze.length - 1){
            pathObstacle(p + "D", maze, r + 1, c);
        }
        if (c < maze[0].length - 1){
            pathObstacle(p + "R", maze, r, c + 1);
        }
    }
}
