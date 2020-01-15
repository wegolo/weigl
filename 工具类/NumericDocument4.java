package util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class NumericDocument4 extends PlainDocument {
    private static final long serialVersionUID = 1L;

    public void insertString(int offs, String str, AttributeSet a)
            throws BadLocationException {
        if (str == null) {
            return;
        }
        if ((getLength() + str.length()) <= 4) {
            int length = 0;
            char[] upper = str.toCharArray();
            for (int i = 0; i < upper.length; i++) {
                if (offs + i == 0 && upper[i] == '0') {

                } else if (upper[i] >= '0' && upper[i] <= '9') {
                    upper[length++] = upper[i];
                }
            }
            super.insertString(offs, new String(upper, 0, length), a);
        }
    }
}