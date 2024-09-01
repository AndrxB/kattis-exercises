package F2023;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

class keylogger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<String> judgement = new ArrayList<>();
        List<String> verdict;

        HashMap<String, String> table = new HashMap<>();

        table.put("clank","a");
        table.put("bong","b");
        table.put("click","c");
        table.put("tap","d");
        table.put("poing","e");
        table.put("clonk","f");
        table.put("clack","g");
        table.put("ping","h");
        table.put("tip","i");
        table.put("cloing","j");
        table.put("tic","k");
        table.put("cling","l");

        table.put("bing","m");
        table.put("pong","n");
        table.put("clang","o");
        table.put("pang","p");
        table.put("clong","q");
        table.put("tac","r");
        table.put("boing","s");
        table.put("boink","t");
        table.put("cloink","u");
        table.put("rattle","v");
        table.put("clock","w");
        table.put("toc","x");
        table.put("clink","y");
        table.put("tuc","z");

        table.put("whack", " ");


        for(int i = 0; i<n;i++){
            judgement.add(sc.next());
        }

        verdict = getTable(judgement, table);

        for(String j : verdict){
            System.out.print(j);
        }
    }

    public static ArrayList<String> getTable(List<String> judgement, HashMap<String, String> table){
        ArrayList<String> finalVerdict = new ArrayList<>();

        Boolean capslock = false;
        Boolean shift = false;
        int i = 0;

        for(String j : judgement){
            String verdict = table.getOrDefault(j, "");


            if(j.equals("bump")){
                if(capslock){
                    capslock = false;
                } else{
                    capslock = true;
                }
            }

            if(j.equals("dink")||j.equals("thumb")){
                if(shift){
                    shift = false;
                } else{
                    shift = true;
                }
            }

            if(capslock && shift){
                finalVerdict.add(verdict);
                i++;
            } else if(capslock && !shift){
                finalVerdict.add(verdict.toUpperCase());
                i++;
            } else if(!capslock && shift){
                finalVerdict.add(verdict.toUpperCase());
                i++;
            } else {
                finalVerdict.add(verdict);
                i++;
            }

            if(j.equals("pop")){
                i--;
                finalVerdict.remove(i);
            }
        }


        return finalVerdict;
    }
}
