package com.statefarm;

public class Application {

    public static void main(String[] args) {
       if (args.length < 2 && args.length >0) {
           System.out.println("Please specify an email for " + args[0]);
       } else if (args.length < 2) {
           System.out.println("Please specify a name and email");
       } else {
           System.out.println(args[0] + " " + '<' + args[1] + '>');
       }
    }
}
