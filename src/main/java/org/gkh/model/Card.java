package org.gkh.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author aleksandrpliskin on 27.02.17.
 */
@Document(collection = "cards")
public class Card {

    public Card() {
        this.cardHolder = "TestUser";
        this.cvc = "386";
        this.cardNumber = "5209356113866895";

        Date dueDate = null;
        SimpleDateFormat sdf = new SimpleDateFormat("MM/yy");
        try {
            dueDate = sdf.parse("01/19");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.dueDate = dueDate;
    }

    @Id
    private String cardNumber;
    private String cvc;
    private Date dueDate;
    private String cardHolder;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }
}
