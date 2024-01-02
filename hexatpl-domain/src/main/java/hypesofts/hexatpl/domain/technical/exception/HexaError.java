package hypesofts.hexatpl.domain.technical.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public enum HexaError implements Serializable {

    ENTITY_FETCHER_NOT_FOUND ("No entity fetcher found for this entity");

    private final String value;
}