package org.shvetsov;

import lombok.Getter;

@SuppressWarnings({"FieldCanBeLocal", "unused"})
public enum InputAnswer {

    DAY_1_PART_1_EXAMPLE("1", 1, null, InputType.EXAMPLE, 11L),
    DAY_1_PART_2_EXAMPLE("1", 2, null, InputType.EXAMPLE, 31L),
    DAY_1_PART_1_REAL_ANTON("1", 1, "Anton", InputType.REAL, 1_830_467L),
    DAY_1_PART_2_REAL_ANTON("1", 2, "Anton", InputType.REAL, 26_674_158L),

    DAY_2_PART_1_EXAMPLE("2", 1, null, InputType.EXAMPLE, 2L),
    DAY_2_PART_2_EXAMPLE("2", 2, null, InputType.EXAMPLE, 4L),
    DAY_2_PART_2_2_EXAMPLE("2", "2", 2, null, InputType.EXAMPLE, 6L),
    DAY_2_PART_1_REAL_ANTON("2", 1, "Anton", InputType.REAL, 341L),
    DAY_2_PART_2_REAL_ANTON("2", 2, "Anton", InputType.REAL, 404L),

    DAY_3_PART_1_EXAMPLE("3", "1", 1, null, InputType.EXAMPLE, 161L),
    DAY_3_PART_2_EXAMPLE("3", "2", 2, null, InputType.EXAMPLE, 48L),
    DAY_3_PART_1_REAL_ANTON("3", 1, "Anton", InputType.REAL, 178794710L),
    DAY_3_PART_2_REAL_ANTON("3", 2, "Anton", InputType.REAL, 76729637L),

    DAY_4_PART_1_EXAMPLE("4", 1, null, InputType.EXAMPLE, 18L),
    DAY_4_PART_2_EXAMPLE("4", 2, null, InputType.EXAMPLE, 9L),
    DAY_4_PART_1_REAL_ANTON("4", 1, "Anton", InputType.REAL, 2447L),
    DAY_4_PART_2_REAL_ANTON("4", 2, "Anton", InputType.REAL, 1868L),

    DAY_5_PART_1_EXAMPLE("5", 1, null, InputType.EXAMPLE, 143L),
    DAY_5_PART_2_EXAMPLE("5", 2, null, InputType.EXAMPLE, 123L),
    DAY_5_PART_1_REAL_ANTON("5", 1, "Anton", InputType.REAL, 4689L),
    DAY_5_PART_2_REAL_ANTON("5", 2, "Anton", InputType.REAL, 6336L),

    DAY_6_PART_1_EXAMPLE("6", 1, null, InputType.EXAMPLE, 41L),
    DAY_6_PART_2_EXAMPLE("6", 2, null, InputType.EXAMPLE, 6L),
    DAY_6_PART_1_REAL_ANTON("6", 1, "Anton", InputType.REAL, 5461L),
    DAY_6_PART_2_REAL_ANTON("6", 2, "Anton", InputType.REAL, 1836L),

    DAY_7_PART_1_EXAMPLE("7", 1, null, InputType.EXAMPLE, 3749L),
    DAY_7_PART_2_EXAMPLE("7", 2, null, InputType.EXAMPLE, 11387L),
    DAY_7_PART_1_REAL_ANTON("7", 1, "Anton", InputType.REAL, 465_126_289_353L),
    DAY_7_PART_2_REAL_ANTON("7", 2, "Anton", InputType.REAL, 70_597_497_486_371L),

    DAY_8_PART_1_EXAMPLE("8", 1, null, InputType.EXAMPLE, 14L),
    DAY_8_PART_2_EXAMPLE("8", 2, null, InputType.EXAMPLE, 34L),
    DAY_8_PART_1_REAL_ANTON("8", 1, "Anton", InputType.REAL, 256L),
    DAY_8_PART_2_REAL_ANTON("8", 2, "Anton", InputType.REAL, 1005L),

    DAY_9_PART_1_EXAMPLE("9", 1, null, InputType.EXAMPLE, 1928L),
    DAY_9_PART_2_EXAMPLE("9", 2, null, InputType.EXAMPLE, 2858L),
    DAY_9_PART_1_REAL_ANTON("9", 1, "Anton", InputType.REAL, 6448989155953L),
    DAY_9_PART_2_REAL_ANTON("9", 2, "Anton", InputType.REAL, 6476642796832L),

    DAY_10_PART_1_EXAMPLE("10", 1, null, InputType.EXAMPLE, 36L),
    DAY_10_PART_2_EXAMPLE("10", 2, null, InputType.EXAMPLE, 81L),
    DAY_10_PART_1_REAL_ANTON("10", 1, "Anton", InputType.REAL, 550L),
    DAY_10_PART_2_REAL_ANTON("10", 2, "Anton", InputType.REAL, 1255L),

    DAY_11_PART_1_EXAMPLE("11", 1, null, InputType.EXAMPLE, 25, 55312L),
    DAY_11_PART_1_REAL_ANTON("11", 1, "Anton", InputType.REAL, 25, 231278L),
    DAY_11_PART_2_REAL_ANTON("11", 2, "Anton", InputType.REAL, 75, 274229228071551L),

    DAY_12_PART_1_1_EXAMPLE("12", "1", 1, null, InputType.EXAMPLE, 140L),
    DAY_12_PART_1_2_EXAMPLE("12", "2", 1, null, InputType.EXAMPLE, 772L),
    DAY_12_PART_1_3_EXAMPLE("12", "3", 1, null, InputType.EXAMPLE, 1930L),
    DAY_12_PART_2_1_EXAMPLE("12", "1", 2, null, InputType.EXAMPLE, 80L),
    DAY_12_PART_2_2_EXAMPLE("12", "2", 2, null, InputType.EXAMPLE, 436L),
    DAY_12_PART_2_3_EXAMPLE("12", "3", 2, null, InputType.EXAMPLE, 1206L),
    DAY_12_PART_2_4_EXAMPLE("12", "4", 2, null, InputType.EXAMPLE, 236L),
    DAY_12_PART_2_5_EXAMPLE("12", "5", 2, null, InputType.EXAMPLE, 368L),
    DAY_12_PART_1_REAL_ANTON("12", 1, "Anton", InputType.REAL, 1473276L),
    DAY_12_PART_2_REAL_ANTON("12", 2, "Anton", InputType.REAL, 901100L),

    DAY_13_PART_1_EXAMPLE("13", 1, null, InputType.EXAMPLE, 480L),
    DAY_13_PART_1_REAL_ANTON("13", 1, "Anton", InputType.REAL, 36954L),
    DAY_13_PART_2_REAL_ANTON("13", 2, "Anton", InputType.REAL, 79352015273424L),

    DAY_14_PART_1_EXAMPLE("14", 1, null, InputType.EXAMPLE, new int[]{11, 7}, 12L),
    DAY_14_PART_1_REAL_ANTON("14", 1, "Anton", InputType.REAL, new int[]{101, 103}, 228421332L),
    DAY_14_PART_2_REAL_ANTON("14", 2, "Anton", InputType.REAL, new int[]{101, 103}, 7790L),

    DAY_15_PART_1_1_EXAMPLE("15", "1", 1, null, InputType.EXAMPLE, 2028L),
    DAY_15_PART_1_2_EXAMPLE("15", "2", 1, null, InputType.EXAMPLE, 10092L),
    DAY_15_PART_2_3_EXAMPLE("15", "3", 2, null, InputType.EXAMPLE, 618L),
    DAY_15_PART_2_2_EXAMPLE("15", "2", 2, null, InputType.EXAMPLE, 9021L),
    DAY_15_PART_1_REAL_ANTON("15", 1, "Anton", InputType.REAL, 1485257L),
    DAY_15_PART_2_REAL_ANTON("15", 2, "Anton", InputType.REAL, 1475512L),

    DAY_16_PART_1_EXAMPLE("16", 1, null, InputType.EXAMPLE, -1L),
    DAY_16_PART_2_EXAMPLE("16", 2, null, InputType.EXAMPLE, -1L),
    DAY_16_PART_1_REAL_ANTON("16", 1, "Anton", InputType.REAL, -1L),
    DAY_16_PART_2_REAL_ANTON("16", 2, "Anton", InputType.REAL, -1L),

    DAY_17_PART_1_EXAMPLE("17", 1, null, InputType.EXAMPLE, -1L),
    DAY_17_PART_2_EXAMPLE("17", 2, null, InputType.EXAMPLE, -1L),
    DAY_17_PART_1_REAL_ANTON("17", 1, "Anton", InputType.REAL, -1L),
    DAY_17_PART_2_REAL_ANTON("17", 2, "Anton", InputType.REAL, -1L),

    DAY_18_PART_1_EXAMPLE("18", 1, null, InputType.EXAMPLE, -1L),
    DAY_18_PART_2_EXAMPLE("18", 2, null, InputType.EXAMPLE, -1L),
    DAY_18_PART_1_REAL_ANTON("18", 1, "Anton", InputType.REAL, -1L),
    DAY_18_PART_2_REAL_ANTON("18", 2, "Anton", InputType.REAL, -1L),

    DAY_19_PART_1_EXAMPLE("19", 1, null, InputType.EXAMPLE, -1L),
    DAY_19_PART_2_EXAMPLE("19", 2, null, InputType.EXAMPLE, -1L),
    DAY_19_PART_1_REAL_ANTON("19", 1, "Anton", InputType.REAL, -1L),
    DAY_19_PART_2_REAL_ANTON("19", 2, "Anton", InputType.REAL, -1L),

    DAY_20_PART_1_EXAMPLE("20", 1, null, InputType.EXAMPLE, -1L),
    DAY_20_PART_2_EXAMPLE("20", 2, null, InputType.EXAMPLE, -1L),
    DAY_20_PART_1_REAL_ANTON("20", 1, "Anton", InputType.REAL, -1L),
    DAY_20_PART_2_REAL_ANTON("20", 2, "Anton", InputType.REAL, -1L),

    DAY_21_PART_1_EXAMPLE("21", 1, null, InputType.EXAMPLE, -1L),
    DAY_21_PART_2_EXAMPLE("21", 2, null, InputType.EXAMPLE, -1L),
    DAY_21_PART_1_REAL_ANTON("21", 1, "Anton", InputType.REAL, -1L),
    DAY_21_PART_2_REAL_ANTON("21", 2, "Anton", InputType.REAL, -1L),

    DAY_22_PART_1_EXAMPLE("22", 1, null, InputType.EXAMPLE, -1L),
    DAY_22_PART_2_EXAMPLE("22", 2, null, InputType.EXAMPLE, -1L),
    DAY_22_PART_1_REAL_ANTON("22", 1, "Anton", InputType.REAL, -1L),
    DAY_22_PART_2_REAL_ANTON("22", 2, "Anton", InputType.REAL, -1L),

    DAY_23_PART_1_EXAMPLE("23", 1, null, InputType.EXAMPLE, -1L),
    DAY_23_PART_2_EXAMPLE("23", 2, null, InputType.EXAMPLE, -1L),
    DAY_23_PART_1_REAL_ANTON("23", 1, "Anton", InputType.REAL, -1L),
    DAY_23_PART_2_REAL_ANTON("23", 2, "Anton", InputType.REAL, -1L),

    DAY_24_PART_1_EXAMPLE("24", 1, null, InputType.EXAMPLE, -1L),
    DAY_24_PART_2_EXAMPLE("24", 2, null, InputType.EXAMPLE, -1L),
    DAY_24_PART_1_REAL_ANTON("24", 1, "Anton", InputType.REAL, -1L),
    DAY_24_PART_2_REAL_ANTON("24", 2, "Anton", InputType.REAL, -1L),

    DAY_25_PART_1_EXAMPLE("25", 1, null, InputType.EXAMPLE, -1L),
    DAY_25_PART_2_EXAMPLE("25", 2, null, InputType.EXAMPLE, -1L),
    DAY_25_PART_1_REAL_ANTON("25", 1, "Anton", InputType.REAL, -1L),
    DAY_25_PART_2_REAL_ANTON("25", 2, "Anton", InputType.REAL, -1L),
    ;

    private static final String RESOURCES = "src/main/resources/";

    private final String day;
    private String subInputNum;
    private final int part;
    private final String user;
    private final InputType inputType;
    @Getter
    private Object additionalInput = null;
    @Getter
    private final Number answer;

    InputAnswer(String day, int part, String user, InputType inputType, Number answer) {
        this.day = day;
        this.part = part;
        this.user = user;
        this.inputType = inputType;
        this.answer = answer;
    }

    InputAnswer(String day, String subInputNum, int part, String user, InputType inputType, Number answer) {
        this.day = day;
        this.subInputNum = subInputNum;
        this.part = part;
        this.user = user;
        this.inputType = inputType;
        this.answer = answer;
    }

    InputAnswer(String day, int part, String user, InputType inputType, Object additionalInput, Number answer) {
        this.day = day;
        this.part = part;
        this.user = user;
        this.inputType = inputType;
        this.additionalInput = additionalInput;
        this.answer = answer;
    }

    public String getInput(InputFormat inputFormat) {
        StringBuilder res = new StringBuilder();
        if (inputFormat.equals(InputFormat.PATH)) {
            res.append(RESOURCES);
        }
        res.append("day").append(day).append("/").append(inputType.namePattern).append("_").append(day);
        if (subInputNum != null) {
            res.append("-").append(subInputNum);
        }
        if (inputType.equals(InputType.REAL)) {
            res.append("_").append(user);
        }
        res.append(".txt");
        return res.toString();
    }

    public enum InputFormat {
        PATH,
        NAME
    }

    public enum InputType {
        EXAMPLE("example"),
        REAL("input");

        public final String namePattern;

        InputType(String namePattern) {
            this.namePattern = namePattern;
        }


    }

}
