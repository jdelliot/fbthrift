/**
 * Autogenerated by Thrift for src/includes.thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated @nocommit
 */
#include "thrift/compiler/test/fixtures/mcpp2-compare/gen-cpp2/includes_types.h"
#include "thrift/compiler/test/fixtures/mcpp2-compare/gen-cpp2/includes_types.tcc"

#include <thrift/lib/cpp2/gen/module_types_cpp.h>

#include "thrift/compiler/test/fixtures/mcpp2-compare/gen-cpp2/includes_data.h"


namespace apache { namespace thrift {

constexpr std::size_t const TEnumTraits<::a::different::ns::AnEnum>::size;
folly::Range<::a::different::ns::AnEnum const*> const TEnumTraits<::a::different::ns::AnEnum>::values = folly::range(TEnumDataStorage<::a::different::ns::AnEnum>::values);
folly::Range<folly::StringPiece const*> const TEnumTraits<::a::different::ns::AnEnum>::names = folly::range(TEnumDataStorage<::a::different::ns::AnEnum>::names);

char const* TEnumTraits<::a::different::ns::AnEnum>::findName(type value) {
  using factory = ::a::different::ns::_AnEnum_EnumMapFactory;
  static folly::Indestructible<factory::ValuesToNamesMapType> const map{
      factory::makeValuesToNamesMap()};
  auto found = map->find(value);
  return found == map->end() ? nullptr : found->second;
}

bool TEnumTraits<::a::different::ns::AnEnum>::findValue(char const* name, type* out) {
  using factory = ::a::different::ns::_AnEnum_EnumMapFactory;
  static folly::Indestructible<factory::NamesToValuesMapType> const map{
      factory::makeNamesToValuesMap()};
  auto found = map->find(name);
  return found == map->end() ? false : (*out = found->second, true);
}

}} // apache::thrift

namespace a { namespace different { namespace ns {
FOLLY_PUSH_WARNING
FOLLY_GNU_DISABLE_WARNING("-Wdeprecated-declarations")
const _AnEnum_EnumMapFactory::ValuesToNamesMapType _AnEnum_VALUES_TO_NAMES = _AnEnum_EnumMapFactory::makeValuesToNamesMap();
const _AnEnum_EnumMapFactory::NamesToValuesMapType _AnEnum_NAMES_TO_VALUES = _AnEnum_EnumMapFactory::makeNamesToValuesMap();
FOLLY_POP_WARNING

}}} // a::different::ns

namespace apache {
namespace thrift {
namespace detail {

void TccStructTraits<::a::different::ns::AStruct>::translateFieldName(
    folly::StringPiece _fname,
    int16_t& fid,
    apache::thrift::protocol::TType& _ftype) noexcept {
  using data = apache::thrift::TStructDataStorage<::a::different::ns::AStruct>;
  static const st::translate_field_name_table table{
      data::fields_size,
      data::fields_names.data(),
      data::fields_ids.data(),
      data::fields_types.data()};
  st::translate_field_name(_fname, fid, _ftype, table);
}

} // namespace detail
} // namespace thrift
} // namespace apache

namespace a { namespace different { namespace ns {


AStruct::AStruct(apache::thrift::FragileConstructor, ::std::int32_t FieldA__arg) :
    __fbthrift_field_FieldA(std::move(FieldA__arg)) {
  __isset.set(folly::index_constant<0>(), true);
}


void AStruct::__clear() {
  // clear all fields
  this->__fbthrift_field_FieldA = ::std::int32_t();
  __isset = {};
}

bool AStruct::operator==(const AStruct& rhs) const {
  (void)rhs;
  auto& lhs = *this;
  (void)lhs;
  if (!(lhs.FieldA_ref() == rhs.FieldA_ref())) {
    return false;
  }
  return true;
}

bool AStruct::operator<(const AStruct& rhs) const {
  (void)rhs;
  auto& lhs = *this;
  (void)lhs;
  if (!(lhs.FieldA_ref() == rhs.FieldA_ref())) {
    return lhs.FieldA_ref() < rhs.FieldA_ref();
  }
  return false;
}


void swap(AStruct& a, AStruct& b) {
  using ::std::swap;
  swap(a.FieldA_ref().value(), b.FieldA_ref().value());
  swap(a.__isset, b.__isset);
}

template void AStruct::readNoXfer<>(apache::thrift::BinaryProtocolReader*);
template uint32_t AStruct::write<>(apache::thrift::BinaryProtocolWriter*) const;
template uint32_t AStruct::serializedSize<>(apache::thrift::BinaryProtocolWriter const*) const;
template uint32_t AStruct::serializedSizeZC<>(apache::thrift::BinaryProtocolWriter const*) const;
template void AStruct::readNoXfer<>(apache::thrift::CompactProtocolReader*);
template uint32_t AStruct::write<>(apache::thrift::CompactProtocolWriter*) const;
template uint32_t AStruct::serializedSize<>(apache::thrift::CompactProtocolWriter const*) const;
template uint32_t AStruct::serializedSizeZC<>(apache::thrift::CompactProtocolWriter const*) const;
template void AStruct::readNoXfer<>(apache::thrift::SimpleJSONProtocolReader*);
template uint32_t AStruct::write<>(apache::thrift::SimpleJSONProtocolWriter*) const;
template uint32_t AStruct::serializedSize<>(apache::thrift::SimpleJSONProtocolWriter const*) const;
template uint32_t AStruct::serializedSizeZC<>(apache::thrift::SimpleJSONProtocolWriter const*) const;



}}} // a::different::ns

namespace apache {
namespace thrift {
namespace detail {

void TccStructTraits<::a::different::ns::AStructB>::translateFieldName(
    folly::StringPiece _fname,
    int16_t& fid,
    apache::thrift::protocol::TType& _ftype) noexcept {
  using data = apache::thrift::TStructDataStorage<::a::different::ns::AStructB>;
  static const st::translate_field_name_table table{
      data::fields_size,
      data::fields_names.data(),
      data::fields_ids.data(),
      data::fields_types.data()};
  st::translate_field_name(_fname, fid, _ftype, table);
}

} // namespace detail
} // namespace thrift
} // namespace apache

namespace a { namespace different { namespace ns {

AStructB::AStructB(const AStructB&) = default;
AStructB& AStructB::operator=(const AStructB&) = default;
AStructB::AStructB(AStructB&& other) noexcept  :
    FieldA(std::move(other.FieldA)) {
}

AStructB& AStructB::operator=(FOLLY_MAYBE_UNUSED AStructB&& other) noexcept {
    this->FieldA = std::move(other.FieldA);
    return *this;
}


AStructB::AStructB(apache::thrift::FragileConstructor, ::std::shared_ptr<const ::a::different::ns::AStruct> FieldA__arg) :
    FieldA(std::move(FieldA__arg)) {
}


void AStructB::__clear() {
  // clear all fields
  if (this->FieldA) this->FieldA = ::apache::thrift::detail::make_mutable_smart_ptr<::std::shared_ptr<const ::a::different::ns::AStruct>>();
}

bool AStructB::operator==(const AStructB& rhs) const {
  (void)rhs;
  auto& lhs = *this;
  (void)lhs;
  if ((!::apache::thrift::detail::pointer_equal(lhs.FieldA_ref(), rhs.FieldA_ref()))) {
    return false;
  }
  return true;
}

bool AStructB::operator<(const AStructB& rhs) const {
  (void)rhs;
  auto& lhs = *this;
  (void)lhs;
  if ((!::apache::thrift::detail::pointer_equal(lhs.FieldA_ref(), rhs.FieldA_ref()))) {
    return ::apache::thrift::detail::pointer_less(lhs.FieldA_ref(), rhs.FieldA_ref());
  }
  return false;
}


void swap(AStructB& a, AStructB& b) {
  using ::std::swap;
  swap(a.FieldA, b.FieldA);
}

template void AStructB::readNoXfer<>(apache::thrift::BinaryProtocolReader*);
template uint32_t AStructB::write<>(apache::thrift::BinaryProtocolWriter*) const;
template uint32_t AStructB::serializedSize<>(apache::thrift::BinaryProtocolWriter const*) const;
template uint32_t AStructB::serializedSizeZC<>(apache::thrift::BinaryProtocolWriter const*) const;
template void AStructB::readNoXfer<>(apache::thrift::CompactProtocolReader*);
template uint32_t AStructB::write<>(apache::thrift::CompactProtocolWriter*) const;
template uint32_t AStructB::serializedSize<>(apache::thrift::CompactProtocolWriter const*) const;
template uint32_t AStructB::serializedSizeZC<>(apache::thrift::CompactProtocolWriter const*) const;
template void AStructB::readNoXfer<>(apache::thrift::SimpleJSONProtocolReader*);
template uint32_t AStructB::write<>(apache::thrift::SimpleJSONProtocolWriter*) const;
template uint32_t AStructB::serializedSize<>(apache::thrift::SimpleJSONProtocolWriter const*) const;
template uint32_t AStructB::serializedSizeZC<>(apache::thrift::SimpleJSONProtocolWriter const*) const;

static_assert(
    ::apache::thrift::detail::st::gen_check_json<
        AStructB,
        ::apache::thrift::type_class::structure,
        ::a::different::ns::AStruct>,
    "inconsistent use of json option");

static_assert(
    ::apache::thrift::detail::st::gen_check_nimble<
        AStructB,
        ::apache::thrift::type_class::structure,
        ::a::different::ns::AStruct>,
    "inconsistent use of nimble option");

}}} // a::different::ns

namespace a { namespace different { namespace ns { namespace {
FOLLY_MAYBE_UNUSED FOLLY_ERASE void validateAdapters() {
}
}}}} // a::different::ns
