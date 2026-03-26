package br.edu.ufvjm.delivery.model.enums;

public enum OrderStatus {

    RECEIVED,
    PREPARING,
    OUT_FOR_DELIVERY,
    DELIVERED,
    CANCELED;

    public boolean canTransitionTo(OrderStatus next) {
        return switch (this) {
            case RECEIVED -> next == PREPARING || next == CANCELED;
            case PREPARING -> next == OUT_FOR_DELIVERY || next == CANCELED;
            case OUT_FOR_DELIVERY -> next == DELIVERED;
            default -> false;
        };
    }
}