package org.example.event;

import lombok.Builder;

import java.time.Instant;

@Builder
public record SubmitLink(Instant timestamp, String paymentLinkId,
                         String userId) implements PaymentEvent {
}
