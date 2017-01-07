package com.hoofmen.mapchat.shared;

import com.hoofmen.mapchat.messages.exceptions.NoMessagesFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

/**
 * Created by NIS1528 on 1/6/17.
 */
@Service
public class AppMessageFactory {

    @Autowired
    private MessageSource messageSource;

    public AppMessage getSuccessMessage(HttpServletRequest req, String messageCode) {
        Locale locale = LocaleContextHolder.getLocale();
        String successMessage = messageSource.getMessage(messageCode, null, locale);
        AppMessage appMessage = new AppMessage();
        appMessage.setCode(messageCode);
        appMessage.setMessage(successMessage);

        return appMessage;
    }
}
