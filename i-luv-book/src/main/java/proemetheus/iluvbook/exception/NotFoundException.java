package proemetheus.iluvbook.exception;

import proemetheus.iluvbook.exception.code.ErrorCode;

public class NotFoundException extends BusinessException {
    public NotFoundException(ErrorCode errorCode) {
        super(errorCode);
    }

    public NotFoundException(ErrorCode errorCode, long id) {
        super(errorCode, "id " + id + " is not found");
    }
}
