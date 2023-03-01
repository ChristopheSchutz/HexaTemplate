package hypesofts.owlfonso.domain.technical.entityfetcher;


import hypesofts.owlfonso.domain.technical.baseclass.DomainEntity;
import hypesofts.owlfonso.domain.technical.baseclass.DomainId;

public interface EntityFetcher<I extends DomainId, E extends DomainEntity> {

    E fetchEntity(I domainId);

    Class<? extends DomainId> getDomainIdConcreteClass();

    default <I> boolean canFetch(DomainId id) {
        return id.getClass().isAssignableFrom(getDomainIdConcreteClass());
    }
}
