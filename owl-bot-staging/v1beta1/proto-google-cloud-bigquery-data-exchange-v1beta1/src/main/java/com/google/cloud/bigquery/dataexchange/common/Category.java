// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/dataexchange/common/common.proto

package com.google.cloud.bigquery.dataexchange.common;

/**
 * <pre>
 * Listing categories.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.bigquery.dataexchange.common.Category}
 */
public enum Category
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CATEGORY_UNSPECIFIED = 0;</code>
   */
  CATEGORY_UNSPECIFIED(0),
  /**
   * <code>CATEGORY_OTHERS = 1;</code>
   */
  CATEGORY_OTHERS(1),
  /**
   * <code>CATEGORY_ADVERTISING_AND_MARKETING = 2;</code>
   */
  CATEGORY_ADVERTISING_AND_MARKETING(2),
  /**
   * <code>CATEGORY_COMMERCE = 3;</code>
   */
  CATEGORY_COMMERCE(3),
  /**
   * <code>CATEGORY_CLIMATE_AND_ENVIRONMENT = 4;</code>
   */
  CATEGORY_CLIMATE_AND_ENVIRONMENT(4),
  /**
   * <code>CATEGORY_DEMOGRAPHICS = 5;</code>
   */
  CATEGORY_DEMOGRAPHICS(5),
  /**
   * <code>CATEGORY_ECONOMICS = 6;</code>
   */
  CATEGORY_ECONOMICS(6),
  /**
   * <code>CATEGORY_EDUCATION = 7;</code>
   */
  CATEGORY_EDUCATION(7),
  /**
   * <code>CATEGORY_ENERGY = 8;</code>
   */
  CATEGORY_ENERGY(8),
  /**
   * <code>CATEGORY_FINANCIAL = 9;</code>
   */
  CATEGORY_FINANCIAL(9),
  /**
   * <code>CATEGORY_GAMING = 10;</code>
   */
  CATEGORY_GAMING(10),
  /**
   * <code>CATEGORY_GEOSPATIAL = 11;</code>
   */
  CATEGORY_GEOSPATIAL(11),
  /**
   * <code>CATEGORY_HEALTHCARE_AND_LIFE_SCIENCE = 12;</code>
   */
  CATEGORY_HEALTHCARE_AND_LIFE_SCIENCE(12),
  /**
   * <code>CATEGORY_MEDIA = 13;</code>
   */
  CATEGORY_MEDIA(13),
  /**
   * <code>CATEGORY_PUBLIC_SECTOR = 14;</code>
   */
  CATEGORY_PUBLIC_SECTOR(14),
  /**
   * <code>CATEGORY_RETAIL = 15;</code>
   */
  CATEGORY_RETAIL(15),
  /**
   * <code>CATEGORY_SPORTS = 16;</code>
   */
  CATEGORY_SPORTS(16),
  /**
   * <code>CATEGORY_SCIENCE_AND_RESEARCH = 17;</code>
   */
  CATEGORY_SCIENCE_AND_RESEARCH(17),
  /**
   * <code>CATEGORY_TRANSPORTATION_AND_LOGISTICS = 18;</code>
   */
  CATEGORY_TRANSPORTATION_AND_LOGISTICS(18),
  /**
   * <code>CATEGORY_TRAVEL_AND_TOURISM = 19;</code>
   */
  CATEGORY_TRAVEL_AND_TOURISM(19),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CATEGORY_UNSPECIFIED = 0;</code>
   */
  public static final int CATEGORY_UNSPECIFIED_VALUE = 0;
  /**
   * <code>CATEGORY_OTHERS = 1;</code>
   */
  public static final int CATEGORY_OTHERS_VALUE = 1;
  /**
   * <code>CATEGORY_ADVERTISING_AND_MARKETING = 2;</code>
   */
  public static final int CATEGORY_ADVERTISING_AND_MARKETING_VALUE = 2;
  /**
   * <code>CATEGORY_COMMERCE = 3;</code>
   */
  public static final int CATEGORY_COMMERCE_VALUE = 3;
  /**
   * <code>CATEGORY_CLIMATE_AND_ENVIRONMENT = 4;</code>
   */
  public static final int CATEGORY_CLIMATE_AND_ENVIRONMENT_VALUE = 4;
  /**
   * <code>CATEGORY_DEMOGRAPHICS = 5;</code>
   */
  public static final int CATEGORY_DEMOGRAPHICS_VALUE = 5;
  /**
   * <code>CATEGORY_ECONOMICS = 6;</code>
   */
  public static final int CATEGORY_ECONOMICS_VALUE = 6;
  /**
   * <code>CATEGORY_EDUCATION = 7;</code>
   */
  public static final int CATEGORY_EDUCATION_VALUE = 7;
  /**
   * <code>CATEGORY_ENERGY = 8;</code>
   */
  public static final int CATEGORY_ENERGY_VALUE = 8;
  /**
   * <code>CATEGORY_FINANCIAL = 9;</code>
   */
  public static final int CATEGORY_FINANCIAL_VALUE = 9;
  /**
   * <code>CATEGORY_GAMING = 10;</code>
   */
  public static final int CATEGORY_GAMING_VALUE = 10;
  /**
   * <code>CATEGORY_GEOSPATIAL = 11;</code>
   */
  public static final int CATEGORY_GEOSPATIAL_VALUE = 11;
  /**
   * <code>CATEGORY_HEALTHCARE_AND_LIFE_SCIENCE = 12;</code>
   */
  public static final int CATEGORY_HEALTHCARE_AND_LIFE_SCIENCE_VALUE = 12;
  /**
   * <code>CATEGORY_MEDIA = 13;</code>
   */
  public static final int CATEGORY_MEDIA_VALUE = 13;
  /**
   * <code>CATEGORY_PUBLIC_SECTOR = 14;</code>
   */
  public static final int CATEGORY_PUBLIC_SECTOR_VALUE = 14;
  /**
   * <code>CATEGORY_RETAIL = 15;</code>
   */
  public static final int CATEGORY_RETAIL_VALUE = 15;
  /**
   * <code>CATEGORY_SPORTS = 16;</code>
   */
  public static final int CATEGORY_SPORTS_VALUE = 16;
  /**
   * <code>CATEGORY_SCIENCE_AND_RESEARCH = 17;</code>
   */
  public static final int CATEGORY_SCIENCE_AND_RESEARCH_VALUE = 17;
  /**
   * <code>CATEGORY_TRANSPORTATION_AND_LOGISTICS = 18;</code>
   */
  public static final int CATEGORY_TRANSPORTATION_AND_LOGISTICS_VALUE = 18;
  /**
   * <code>CATEGORY_TRAVEL_AND_TOURISM = 19;</code>
   */
  public static final int CATEGORY_TRAVEL_AND_TOURISM_VALUE = 19;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Category valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Category forNumber(int value) {
    switch (value) {
      case 0: return CATEGORY_UNSPECIFIED;
      case 1: return CATEGORY_OTHERS;
      case 2: return CATEGORY_ADVERTISING_AND_MARKETING;
      case 3: return CATEGORY_COMMERCE;
      case 4: return CATEGORY_CLIMATE_AND_ENVIRONMENT;
      case 5: return CATEGORY_DEMOGRAPHICS;
      case 6: return CATEGORY_ECONOMICS;
      case 7: return CATEGORY_EDUCATION;
      case 8: return CATEGORY_ENERGY;
      case 9: return CATEGORY_FINANCIAL;
      case 10: return CATEGORY_GAMING;
      case 11: return CATEGORY_GEOSPATIAL;
      case 12: return CATEGORY_HEALTHCARE_AND_LIFE_SCIENCE;
      case 13: return CATEGORY_MEDIA;
      case 14: return CATEGORY_PUBLIC_SECTOR;
      case 15: return CATEGORY_RETAIL;
      case 16: return CATEGORY_SPORTS;
      case 17: return CATEGORY_SCIENCE_AND_RESEARCH;
      case 18: return CATEGORY_TRANSPORTATION_AND_LOGISTICS;
      case 19: return CATEGORY_TRAVEL_AND_TOURISM;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Category>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Category> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Category>() {
          public Category findValueByNumber(int number) {
            return Category.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.cloud.bigquery.dataexchange.common.CommonProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Category[] VALUES = values();

  public static Category valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Category(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.bigquery.dataexchange.common.Category)
}

