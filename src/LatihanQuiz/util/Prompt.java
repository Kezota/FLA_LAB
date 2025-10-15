package LatihanQuiz.util;

import java.util.Arrays;
import java.util.Scanner;

public class Prompt {
    private Scanner scan = new Scanner(System.in);
    private String prompt;

    public Prompt(String prompt) {
        this.prompt = prompt;
    }

    // ========================= INT =========================
    public static class IntConfig {
        private Integer min = null;
        private Integer max = null;
        private String errMsg = "";

        public IntConfig setMin(int min) { this.min = min; return this; }
        public IntConfig setMax(int max) { this.max = max; return this; }
        public IntConfig setErrMsg(String errMsg) { this.errMsg = errMsg + "\n"; return this; }
    }

    public int scanInt() {
        return scanInt(new IntConfig());
    }

    public int scanInt(IntConfig config) {
        while (true) {
            System.out.print(prompt);
            try {
                int value = Integer.parseInt(scan.nextLine());

                if (config.min != null && value < config.min) {
                    System.out.print(config.errMsg);
                    continue;
                }
                if (config.max != null && value > config.max) {
                    System.out.print(config.errMsg);
                    continue;
                }

                return value;
            } catch (NumberFormatException e) {
                System.out.println("Input must be an integer!");
            }
        }
    }

    // ========================= STRING =========================
    public static class StringConfig {
        private Integer min = null;
        private Integer max = null;
        private String[] options = null;
        private boolean caseSensitive = true;
        private String errMsg = "";

        public StringConfig setMin(int min) { this.min = min; return this; }
        public StringConfig setMax(int max) { this.max = max; return this; }
        public StringConfig setOptions(String... options) { this.options = options; return this; }
        public StringConfig setCaseSensitive(boolean caseSensitive) { this.caseSensitive = caseSensitive; return this; }
        public StringConfig setErrMsg(String errMsg) { this.errMsg = errMsg + "\n"; return this; }
    }

    public String scanString() {
        return scanString(new StringConfig());
    }

    public String scanString(StringConfig config) {
        while (true) {
            System.out.print(prompt);
            String value = scan.nextLine().trim();

            if (value.isEmpty()) {
                System.out.println("Input cannot be empty!");
                continue;
            }

            if (config.options != null) {
                boolean match = Arrays.stream(config.options).anyMatch(opt ->
                        config.caseSensitive ? value.equals(opt) : value.equalsIgnoreCase(opt)
                );
                if (!match) {
                    System.out.print(config.errMsg);
                    continue;
                }
            }

            if (config.min != null && value.length() < config.min) {
                System.out.print(config.errMsg);
                continue;
            }

            if (config.max != null && value.length() > config.max) {
                System.out.print(config.errMsg);
                continue;
            }

            return value;
        }
    }

    // ========================= DOUBLE =========================
    public static class DoubleConfig {
        private Double min = null;
        private Double max = null;
        private String errMsg = "";

        public DoubleConfig setMin(double min) { this.min = min; return this; }
        public DoubleConfig setMax(double max) { this.max = max; return this; }
        public DoubleConfig setErrMsg(String errMsg) { this.errMsg = errMsg + "\n"; return this; }
    }

    public double scanDouble() {
        return scanDouble(new DoubleConfig());
    }

    public double scanDouble(DoubleConfig config) {
        while (true) {
            System.out.print(prompt);
            try {
                double value = Double.parseDouble(scan.nextLine());

                if (config.min != null && value < config.min) {
                    System.out.print(config.errMsg);
                    continue;
                }
                if (config.max != null && value > config.max) {
                    System.out.print(config.errMsg);
                    continue;
                }

                return value;
            } catch (NumberFormatException e) {
                System.out.println("Input must be a double!");
            }
        }
    }
}
