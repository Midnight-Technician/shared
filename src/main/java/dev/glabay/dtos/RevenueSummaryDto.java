package dev.glabay.dtos;

import java.time.Instant;
import java.util.List;

public record RevenueSummaryDto(
    Instant from,
    Instant to,
    String currency,
    String subtotalSum,
    String taxSum,
    String totalSum,
    long invoiceCount,
    List<String> invoiceIds
) {}
