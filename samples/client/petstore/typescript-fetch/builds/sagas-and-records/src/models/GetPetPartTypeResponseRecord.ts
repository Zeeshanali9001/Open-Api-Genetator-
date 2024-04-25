/* tslint:disable */
/* eslint-disable */
/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import {ApiRecordUtils, knownRecordFactories, appFromJS, NormalizedRecordEntities} from "../runtimeSagasAndRecords";
import {getApiEntitiesState} from "../ApiEntitiesSelectors"
import {List, Record, RecordOf, Map} from 'immutable';
import {Schema, schema, NormalizedSchema} from "normalizr";
import {select, call} from "redux-saga/effects";

import {
    GetPetPartTypeResponse,
} from './GetPetPartTypeResponse';

import {
    PetPartType,
} from './PetPartType';
import {
    ResponseMeta,
} from './ResponseMeta';

import {
    ResponseMetaRecord,
    responseMetaRecordUtils
} from './ResponseMetaRecord';

export const GetPetPartTypeResponseRecordProps = {
    recType: "GetPetPartTypeResponseApiRecord" as "GetPetPartTypeResponseApiRecord",
    meta: ResponseMetaRecord(),
    data: null as PetPartType | null,
};

export type GetPetPartTypeResponseRecordPropsType = typeof GetPetPartTypeResponseRecordProps;
export const GetPetPartTypeResponseRecord = Record(GetPetPartTypeResponseRecordProps, GetPetPartTypeResponseRecordProps.recType);
export type GetPetPartTypeResponseRecord = RecordOf<GetPetPartTypeResponseRecordPropsType>;

knownRecordFactories.set(GetPetPartTypeResponseRecordProps.recType, GetPetPartTypeResponseRecord);


class GetPetPartTypeResponseRecordUtils extends ApiRecordUtils<GetPetPartTypeResponse, GetPetPartTypeResponseRecord> {
    public normalize(apiObject: GetPetPartTypeResponse, asEntity?: boolean): GetPetPartTypeResponse {
        (apiObject as any).recType = GetPetPartTypeResponseRecordProps.recType;
        responseMetaRecordUtils.normalize(apiObject['meta']);
        return apiObject;
    }

    public toApi(record: GetPetPartTypeResponseRecord): GetPetPartTypeResponse {
        const apiObject = super.toApi(record);
        apiObject['meta'] = responseMetaRecordUtils.toApi(record['meta']);
        return apiObject;
    }

    public fromApiPassthrough(apiObject: GetPetPartTypeResponse): PetPartType {
        return apiObject.data!;
    }

    public fromApiPassthroughAsEntities(apiObject: GetPetPartTypeResponse): NormalizedRecordEntities {
        console.log("entities revival not supported on this response");
        return {entities: {}, result: List<string>()};
    }
}

export const getPetPartTypeResponseRecordUtils = new GetPetPartTypeResponseRecordUtils();

