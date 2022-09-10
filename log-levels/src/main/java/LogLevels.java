public class LogLevels {

    public static String message(String logLine) {
        return getMessage(logLine);
    }

    public static String logLevel(String logLine) {
        return getLogLevel(logLine);
    }

    public static String reformat(String logLine) {
        String message = getMessage(logLine);
        String logLevel = getLogLevel(logLine);
        String result = String.format("%s (%s)", message, logLevel);
        return result;
    }

    private static String getMessage(String logLine) {
        String[] processedInput = logLine.split(":");
        String result = processedInput[1].trim();
        return result;
    }
    private static String getLogLevel(String logLine) {
        String[] processedInput = logLine.split("]");
        String result = processedInput[0].replace("[", "");
        return result.toLowerCase();
    }
}
