package org.shuhrat.testing.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Lenovo on 01.08.2016.
 */
@XmlRootElement
public class ErrorMessage {
    private int errorCode;
    private String errorMessage;
    private String documentation;

    public ErrorMessage(int errorCode, String errorMessage, String documentation) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.documentation = documentation;
    }

    public ErrorMessage() {
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }
}
