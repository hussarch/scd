package com.hussar.app.scd.dcyclt.service;

import com.hussar.app.scd.dcyclt.model.Foo;

import java.util.List;

/**
 * Created by 肖毅(hussarch@126.com) on 18/7/12.
 */
public interface FooService {

    List<Foo> getFooList(Integer size);
}
