package com.mabellou.specification.data;

import com.mabellou.specification.Specification;

public class Cargo {
    private final Specification specification;

    public Cargo(final Specification specification) {
        this.specification = specification;
    }

    public Specification getSpecification() {
        return specification;
    }
}
