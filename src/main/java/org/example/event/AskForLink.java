package org.example.event;

import lombok.Builder;
import org.example.payment_link.Bank;

import java.math.BigDecimal;
import java.time.Instant;

@Builder
public record AskForLink(Instant timestamp, String userId, BigDecimal amount,
                         Bank bank) implements PaymentEvent {
}
