package org.mercycorps.translationcards.txcmaker.service;


import org.mercycorps.translationcards.txcmaker.api.CreateDeckResponse;
import org.mercycorps.translationcards.txcmaker.auth.AuthUtils;
import org.mercycorps.translationcards.txcmaker.model.Deck;

import java.util.Arrays;
import java.util.List;


public class DeckService {

    AuthUtils authUtils;

    public DeckService(AuthUtils authUtils) {
        this.authUtils = authUtils;
    }

    public Deck retrieve(int id) {
        return Deck.stub();
    }

    public void create(Deck deck, CreateDeckResponse createDeckResponse) {
        if ("deck with errors".equals(deck.deck_label)) {
            createDeckResponse.setId(-1);
            createDeckResponse.addError("Error 1");
            createDeckResponse.addWarning("Warning 1");
            createDeckResponse.addWarning("Warning 2");
        } else {
            createDeckResponse.setId(10);
        }
    }

    public List<Deck> retrieveAll() {
        return Arrays.asList(Deck.stub());
    }
}
