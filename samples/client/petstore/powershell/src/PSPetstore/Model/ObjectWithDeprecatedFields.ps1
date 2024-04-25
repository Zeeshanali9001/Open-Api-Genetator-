#
# OpenAPI Petstore
# This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: "" \
# Version: 1.0.0
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

No summary available.

.DESCRIPTION

No description available.

.PARAMETER Uuid
No description available.
.PARAMETER Id
No description available.
.PARAMETER DeprecatedRef
No description available.
.PARAMETER Bars
No description available.
.PARAMETER SomethingElse
No description available.
.OUTPUTS

ObjectWithDeprecatedFields<PSCustomObject>
#>

function Initialize-PSObjectWithDeprecatedFields {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Uuid},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${Id},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${DeprecatedRef},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${Bars},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${SomethingElse}
    )

    Process {
        'Creating PSCustomObject: PSPetstore => PSObjectWithDeprecatedFields' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "uuid" = ${Uuid}
            "id" = ${Id}
            "deprecatedRef" = ${DeprecatedRef}
            "bars" = ${Bars}
            "name_mapping" = ${SomethingElse}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to ObjectWithDeprecatedFields<PSCustomObject>

.DESCRIPTION

Convert from JSON to ObjectWithDeprecatedFields<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

ObjectWithDeprecatedFields<PSCustomObject>
#>
function ConvertFrom-PSJsonToObjectWithDeprecatedFields {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSPetstore => PSObjectWithDeprecatedFields' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in PSObjectWithDeprecatedFields
        $AllProperties = ("uuid", "id", "deprecatedRef", "bars", "name_mapping")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "uuid"))) { #optional property not found
            $Uuid = $null
        } else {
            $Uuid = $JsonParameters.PSobject.Properties["uuid"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "id"))) { #optional property not found
            $Id = $null
        } else {
            $Id = $JsonParameters.PSobject.Properties["id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "deprecatedRef"))) { #optional property not found
            $DeprecatedRef = $null
        } else {
            $DeprecatedRef = $JsonParameters.PSobject.Properties["deprecatedRef"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "bars"))) { #optional property not found
            $Bars = $null
        } else {
            $Bars = $JsonParameters.PSobject.Properties["bars"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "name_mapping"))) { #optional property not found
            $SomethingElse = $null
        } else {
            $SomethingElse = $JsonParameters.PSobject.Properties["name_mapping"].value
        }

        $PSO = [PSCustomObject]@{
            "uuid" = ${Uuid}
            "id" = ${Id}
            "deprecatedRef" = ${DeprecatedRef}
            "bars" = ${Bars}
            "name_mapping" = ${SomethingElse}
        }

        return $PSO
    }

}
