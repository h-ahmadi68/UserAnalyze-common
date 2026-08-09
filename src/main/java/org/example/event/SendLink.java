package org.example.event;

import lombok.Builder;

import java.time.Instant;

@Builder
public record SendLink(Instant timestamp, String paymentLinkId, String userId,
                       String url) implements PaymentEvent {
}
