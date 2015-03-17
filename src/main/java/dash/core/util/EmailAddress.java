package dash.core.util;

import org.springframework.util.Assert;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.regex.Pattern;

/**
 * Created by mglanvill on 2015/03/11.
 */
@Embeddable
public class EmailAddress {

    private static final String EMAIL_REGEX = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final Pattern PATTERN = Pattern.compile(EMAIL_REGEX);

    @Column(name = "email_x", nullable = false, insertable = true, updatable = true, length = 100, precision = 0)
    private String value;

    /**
     * Creates a new {@link EmailAddress} from the given string source.
     *
     * @param emailAddress must not be {@literal null} or empty.
     */
    public EmailAddress(String emailAddress) {
        Assert.isTrue(isValid(emailAddress), "Invalid email address!");
        this.value = emailAddress;
    }

    protected EmailAddress() {

    }

    public String getValue() {
        return value;
    }

    /**
     * Returns whether the given {@link String} is a valid {@link EmailAddress} which means you can safely instantiate the
     * class.
     *
     * @param source
     * @return
     */
    public static boolean isValid(String source) {
        return PATTERN.matcher(source).matches();
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return value;
    }
}
