///usr/bin/env jbang "$0" "$@" ; exit $?

class HiGDev { 

    public static void main(String[] args) {
        String name = args.length==0 ? "GDev 2022" : args[0];
        int length = name.length() + 13;
        String line = "+" + "-".repeat(length) + "+";
        System.out.println(line);
        System.out.println("| Hi there, " + name + "! |");
        System.out.println(line);
    }

}
