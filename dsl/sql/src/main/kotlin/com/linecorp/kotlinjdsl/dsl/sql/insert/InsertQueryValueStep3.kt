package com.linecorp.kotlinjdsl.dsl.sql.insert

import com.linecorp.kotlinjdsl.querymodel.sql.Expression
import com.linecorp.kotlinjdsl.querymodel.sql.InsertQuery
import com.linecorp.kotlinjdsl.querymodel.sql.SqlQueryable

interface InsertQueryValueStep3<T : Any, V1, V2, V3> :
    InsertQuerySelectStep<T>,
    SqlQueryable<InsertQuery<T>> {

    fun values(
        value1: V1,
        value2: V2,
        value3: V3,
    ): InsertQueryValueStep3<T, V1, V2, V3>

    fun values(
        value1: Expression<V1>,
        value2: Expression<V2>,
        value3: Expression<V3>,
    ): InsertQueryValueStep3<T, V1, V2, V3>

    fun values(
        values: Iterable<Expression<*>>,
    ): InsertQueryValueStep3<T, V1, V2, V3>
}
