
package com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperUpdate;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


/**
 * Fluent helper to update an existing {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTexts CouponTexts} entity and save it to the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
@RequiredArgsConstructor
public class CouponTextsUpdateFluentHelper
    extends FluentHelperUpdate<CouponTextsUpdateFluentHelper, CouponTexts>
{

    /**
     * {@link com.s4sdkexample.mkt.payloads.namespaces.mktcouponsrv.CouponTexts CouponTexts} entity object that will be updated in the S/4HANA system.
     * 
     */
    @Getter(AccessLevel.PROTECTED)
    private final CouponTexts entity;

}
