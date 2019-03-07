/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#pragma once

#include <folly/Optional.h>
#include <thrift/lib/cpp2/GeneratedHeaderHelper.h>
#include <thrift/lib/cpp2/Thrift.h>
#include <thrift/lib/cpp2/gen/module_types_h.h>
#include <thrift/lib/cpp2/protocol/Protocol.h>

#include "thrift/compiler/test/fixtures/mcpp2-compare/gen-cpp2/module_types.h"

// BEGIN declare_enums

// END declare_enums
// BEGIN struct_indirection

// END struct_indirection
// BEGIN forward_declare
namespace extra { namespace svc {
class containerStruct2;
}} // extra::svc
// END forward_declare
// BEGIN typedefs

// END typedefs
// BEGIN hash_and_equal_to
// END hash_and_equal_to
namespace extra { namespace svc {
class containerStruct2 final : private apache::thrift::detail::st::ComparisonOperators<containerStruct2> {
 public:

  containerStruct2();

  // FragileConstructor for use in initialization lists only.
  containerStruct2(apache::thrift::FragileConstructor, bool fieldA__arg, bool req_fieldA__arg, bool opt_fieldA__arg, std::map<std::string, bool> fieldB__arg, std::map<std::string, bool> req_fieldB__arg, std::map<std::string, bool> opt_fieldB__arg, std::set<int32_t> fieldC__arg, std::set<int32_t> req_fieldC__arg, std::set<int32_t> opt_fieldC__arg, std::string fieldD__arg, std::string fieldE__arg, std::string req_fieldE__arg, std::string opt_fieldE__arg);
  template <typename _T>
  void __set_field(::apache::thrift::detail::argument_wrapper<1, _T> arg) {
    fieldA = arg.extract();
  }
  template <typename _T>
  void __set_field(::apache::thrift::detail::argument_wrapper<101, _T> arg) {
    req_fieldA = arg.extract();
  }
  template <typename _T>
  void __set_field(::apache::thrift::detail::argument_wrapper<201, _T> arg) {
    opt_fieldA = arg.extract();
  }
  template <typename _T>
  void __set_field(::apache::thrift::detail::argument_wrapper<2, _T> arg) {
    fieldB = arg.extract();
  }
  template <typename _T>
  void __set_field(::apache::thrift::detail::argument_wrapper<102, _T> arg) {
    req_fieldB = arg.extract();
  }
  template <typename _T>
  void __set_field(::apache::thrift::detail::argument_wrapper<202, _T> arg) {
    opt_fieldB = arg.extract();
  }
  template <typename _T>
  void __set_field(::apache::thrift::detail::argument_wrapper<3, _T> arg) {
    fieldC = arg.extract();
  }
  template <typename _T>
  void __set_field(::apache::thrift::detail::argument_wrapper<103, _T> arg) {
    req_fieldC = arg.extract();
  }
  template <typename _T>
  void __set_field(::apache::thrift::detail::argument_wrapper<203, _T> arg) {
    opt_fieldC = arg.extract();
  }
  template <typename _T>
  void __set_field(::apache::thrift::detail::argument_wrapper<4, _T> arg) {
    fieldD = arg.extract();
  }
  template <typename _T>
  void __set_field(::apache::thrift::detail::argument_wrapper<5, _T> arg) {
    fieldE = arg.extract();
  }
  template <typename _T>
  void __set_field(::apache::thrift::detail::argument_wrapper<105, _T> arg) {
    req_fieldE = arg.extract();
  }
  template <typename _T>
  void __set_field(::apache::thrift::detail::argument_wrapper<205, _T> arg) {
    opt_fieldE = arg.extract();
  }

  containerStruct2(containerStruct2&&) = default;

  containerStruct2(const containerStruct2&) = default;

  containerStruct2& operator=(containerStruct2&&) = default;

  containerStruct2& operator=(const containerStruct2&) = default;
  void __clear();

  ~containerStruct2();

  bool fieldA;
  bool req_fieldA;
  folly::Optional<bool> opt_fieldA;
  std::map<std::string, bool> fieldB;
  std::map<std::string, bool> req_fieldB;
  folly::Optional<std::map<std::string, bool>> opt_fieldB;
  std::set<int32_t> fieldC;
  std::set<int32_t> req_fieldC;
  folly::Optional<std::set<int32_t>> opt_fieldC;
  std::string fieldD;
  std::string fieldE;
  std::string req_fieldE;
  folly::Optional<std::string> opt_fieldE;
  bool operator==(const containerStruct2& rhs) const;
  bool operator<(const containerStruct2& rhs) const;

  template <class Protocol_>
  uint32_t read(Protocol_* iprot);
  template <class Protocol_>
  uint32_t serializedSize(Protocol_ const* prot_) const;
  template <class Protocol_>
  uint32_t serializedSizeZC(Protocol_ const* prot_) const;
  template <class Protocol_>
  uint32_t write(Protocol_* prot_) const;

 private:
  template <class Protocol_>
  void readNoXfer(Protocol_* iprot);

  friend class ::apache::thrift::Cpp2Ops< containerStruct2 >;
};

void swap(containerStruct2& a, containerStruct2& b);
extern template void containerStruct2::readNoXfer<>(apache::thrift::BinaryProtocolReader*);
extern template uint32_t containerStruct2::write<>(apache::thrift::BinaryProtocolWriter*) const;
extern template uint32_t containerStruct2::serializedSize<>(apache::thrift::BinaryProtocolWriter const*) const;
extern template uint32_t containerStruct2::serializedSizeZC<>(apache::thrift::BinaryProtocolWriter const*) const;
extern template void containerStruct2::readNoXfer<>(apache::thrift::CompactProtocolReader*);
extern template uint32_t containerStruct2::write<>(apache::thrift::CompactProtocolWriter*) const;
extern template uint32_t containerStruct2::serializedSize<>(apache::thrift::CompactProtocolWriter const*) const;
extern template uint32_t containerStruct2::serializedSizeZC<>(apache::thrift::CompactProtocolWriter const*) const;
extern template void containerStruct2::readNoXfer<>(apache::thrift::SimpleJSONProtocolReader*);
extern template uint32_t containerStruct2::write<>(apache::thrift::SimpleJSONProtocolWriter*) const;
extern template uint32_t containerStruct2::serializedSize<>(apache::thrift::SimpleJSONProtocolWriter const*) const;
extern template uint32_t containerStruct2::serializedSizeZC<>(apache::thrift::SimpleJSONProtocolWriter const*) const;

template <class Protocol_>
uint32_t containerStruct2::read(Protocol_* iprot) {
  auto _xferStart = iprot->getCurrentPosition().getCurrentPosition();
  readNoXfer(iprot);
  return iprot->getCurrentPosition().getCurrentPosition() - _xferStart;
}

}} // extra::svc
namespace apache { namespace thrift {

}} // apache::thrift
