package org.gkh.controller;

import org.gkh.model.Card;
import org.gkh.util.ApiUrls;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * @author aleksandrpliskin on 27.02.17.
 */
@RestController
public class CardController {

    @RequestMapping(value = ApiUrls.Card.BASE_CARD_URL)
    public List<Card> getUserCards() {
        return Collections.emptyList();
    }

}
