package com.rbaltrusch.finapp.convert;

import com.rbaltrusch.finapp.domain.Status;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StatusConverter implements Converter<String, Status> {
    @Override
    public Status convert(String status) {
        return Status.valueOf(status);
    }
}
