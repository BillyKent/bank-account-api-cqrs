package com.techbank.account.query.infrastructure.handlers;

import com.techbank.account.common.events.AccountClosedEvent;
import com.techbank.account.common.events.AccountOpenedEvent;
import com.techbank.account.common.events.FundsDepositedEvent;
import com.techbank.account.common.events.FundsWithdrawnEvent;

public interface EventHandler {
    void onEvent(AccountOpenedEvent event);

    void onEvent(FundsDepositedEvent event);

    void onEvent(FundsWithdrawnEvent event);

    void onEvent(AccountClosedEvent event);
}
