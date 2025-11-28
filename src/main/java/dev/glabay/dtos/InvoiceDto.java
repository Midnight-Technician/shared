package dev.glabay.dtos;

import java.time.Instant;
import java.util.Map;

/**
 * @author Glabay | Glabay-Studios
 * @project midnight-technician
 * @social Discord: Glabay
 * @since 2025-11-21
 */
public record InvoiceDto(
    String paypalInvoiceId,
    String ticketId,
    String customerId,
    String customerEmail,
    String currency,
    String subtotal,
    String tax,
    String total,
    InvoiceStatus status,
    String invoiceNumber,
    String viewUrl,
    Instant createdAt,
    Map<String, String> metadata
) {}
