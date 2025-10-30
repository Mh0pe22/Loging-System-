package logger.enums;

public enum Severity {

    High("High"),
    Medium("Medium"),
    Low("Low");

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Severity(String name) {
        this.name = name;
    }
}
