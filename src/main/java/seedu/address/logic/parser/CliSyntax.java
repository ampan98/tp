package seedu.address.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_NAME = new Prefix("n/");
    public static final Prefix PREFIX_PHONE = new Prefix("p/");
    public static final Prefix PREFIX_EMAIL = new Prefix("e/");
    public static final Prefix PREFIX_ADDRESS = new Prefix("a/");
    public static final Prefix PREFIX_MODE_OF_CONTACT = new Prefix("m/");
    public static final Prefix PREFIX_TAG = new Prefix("t/");
    public static final Prefix PREFIX_REMARK = new Prefix("r/");
    public static final Prefix PREFIX_SORT_CRITERIA = new Prefix("c/");
    public static final Prefix PREFIX_DIRECTION = new Prefix("d/");
    public static final Prefix PREFIX_START_INDEX = new Prefix("start/");
    public static final Prefix PREFIX_END_INDEX = new Prefix("end/");
    public static final Prefix PREFIX_SEPARATOR = new Prefix("s/");
    public static final Prefix PREFIX_BLACKLIST = new Prefix("b/");
}
