package org.gkh.model;

import org.gkh.model.enums.UserRole;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author aleksandrpliskin on 26.02.17.
 */
@Document(collection = "accounts")
public class Account {

    @Id
    private String id;

    private String login;

    private String password;

    private UserRole userRole;

    private List<Card> cards;

    public Account() {
    }

    public Account(String login, String password, List<Card> cards) {
        this.login = login;
        this.password = password;
        this.cards = cards;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
