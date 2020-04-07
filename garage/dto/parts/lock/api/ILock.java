package garage.dto.parts.lock.api;

import garage.dto.parts.api.IParts;
import garage.dto.parts.lock.exceptions.KeyIsWrongException;

public interface ILock extends IParts {

    /**
     * Открыть замок
     * @param key ключ которым мы пытаемся открыть замок
     * @return true если замок открылся, false если замок не открылся
     */
    boolean open(IKey key);

    /**
     * Закрыть замок
     * @param key ключ которым мы пытаемся закрыть замок
     * @return true если замок закрылся, false если замок не закрылся
     */
    boolean close(IKey key) throws KeyIsWrongException;
}
