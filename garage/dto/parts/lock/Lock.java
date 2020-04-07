package garage.dto.parts.lock;

import garage.dto.parts.lock.api.IKey;
import garage.dto.parts.lock.api.ILock;
import garage.dto.parts.lock.exceptions.KeyIsWrongException;

import java.security.Key;

public class Lock implements ILock {
    private boolean open;
    private final String closeKey;


    public Lock(String closeKey) {
        this.closeKey = closeKey;
    }

    @Override
    public boolean open(IKey key) {
        if (closeKey.equals(key.getOpenKey())) {
            open = true;
        }
        return open;
    }

    @Override
    public boolean close(IKey key) throws KeyIsWrongException {
        try {
            if (closeKey.equals(key.getOpenKey())) {
                throw new KeyIsWrongException("Ключ не подходит");

            }
        } catch (KeyIsWrongException e) {
            e.printStackTrace();
        }
        return !open;
    }
}


