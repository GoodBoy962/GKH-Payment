package org.gkh.util;

/**
 * @author aleksandrpliskin on 27.02.17.
 */
public interface ApiUrls {

    String BASE_API_URL = "/gkh/v1";

    interface Card {
        String BASE_CARD_URL = BASE_API_URL + "/cards";
    }

    interface Account {
        String BASE_ACCOUNT_URL = BASE_API_URL + "/accounts";
    }

}
