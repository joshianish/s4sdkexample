
package com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperCreate;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


/**
 * Fluent helper to create a new {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionTag InteractionTag} entity and save it to the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
@RequiredArgsConstructor
public class InteractionTagCreateFluentHelper
    extends FluentHelperCreate<InteractionTagCreateFluentHelper, InteractionTag>
{

    /**
     * {@link com.s4sdkexample.mkt.payloads.namespaces.mktinteractionsrv.InteractionTag InteractionTag} entity object that will be created in the S/4HANA system.
     * 
     */
    @Getter(AccessLevel.PROTECTED)
    private final InteractionTag entity;

}
