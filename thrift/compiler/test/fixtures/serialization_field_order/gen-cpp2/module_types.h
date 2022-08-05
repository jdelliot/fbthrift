/**
 * Autogenerated by Thrift for src/module.thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated @nocommit
 */
#pragma once

#include <thrift/lib/cpp2/gen/module_types_h.h>

#include <thrift/lib/cpp2/type/Tag.h>

#include "thrift/annotation/gen-cpp2/thrift_types.h"

namespace apache {
namespace thrift {
namespace tag {
struct field1;
struct field2;
struct field3;
struct field1;
struct field2;
struct field3;
} // namespace tag
namespace detail {
#ifndef APACHE_THRIFT_ACCESSOR_field1
#define APACHE_THRIFT_ACCESSOR_field1
APACHE_THRIFT_DEFINE_ACCESSOR(field1);
#endif
#ifndef APACHE_THRIFT_ACCESSOR_field2
#define APACHE_THRIFT_ACCESSOR_field2
APACHE_THRIFT_DEFINE_ACCESSOR(field2);
#endif
#ifndef APACHE_THRIFT_ACCESSOR_field3
#define APACHE_THRIFT_ACCESSOR_field3
APACHE_THRIFT_DEFINE_ACCESSOR(field3);
#endif
#ifndef APACHE_THRIFT_ACCESSOR_field1
#define APACHE_THRIFT_ACCESSOR_field1
APACHE_THRIFT_DEFINE_ACCESSOR(field1);
#endif
#ifndef APACHE_THRIFT_ACCESSOR_field2
#define APACHE_THRIFT_ACCESSOR_field2
APACHE_THRIFT_DEFINE_ACCESSOR(field2);
#endif
#ifndef APACHE_THRIFT_ACCESSOR_field3
#define APACHE_THRIFT_ACCESSOR_field3
APACHE_THRIFT_DEFINE_ACCESSOR(field3);
#endif
} // namespace detail
} // namespace thrift
} // namespace apache

// BEGIN declare_enums

// END declare_enums
// BEGIN forward_declare
namespace cpp2 {
class Foo;
class Foo2;
} // cpp2
// END forward_declare
// BEGIN hash_and_equal_to
// END hash_and_equal_to
namespace cpp2 {
using ::apache::thrift::detail::operator!=;
using ::apache::thrift::detail::operator>;
using ::apache::thrift::detail::operator<=;
using ::apache::thrift::detail::operator>=;


class Foo final  {
 private:
  friend struct ::apache::thrift::detail::st::struct_private_access;
  template<class> friend struct ::apache::thrift::detail::invoke_reffer;

  //  used by a static_assert in the corresponding source
  static constexpr bool __fbthrift_cpp2_gen_json = false;
  static const folly::StringPiece __fbthrift_get_field_name(::apache::thrift::FieldOrdinal ord);

  void __fbthrift_clear();
  void __fbthrift_clear_terse_fields();
  bool __fbthrift_is_empty() const;

 public:
  using __fbthrift_cpp2_type = Foo;
  static constexpr bool __fbthrift_cpp2_is_union =
    false;


 public:

  Foo() :
      __fbthrift_field_field1(),
      __fbthrift_field_field2(),
      __fbthrift_field_field3() {
  }
  // FragileConstructor for use in initialization lists only.
  [[deprecated("This constructor is deprecated")]]
  Foo(apache::thrift::FragileConstructor, ::std::int32_t field1__arg, ::std::int32_t field2__arg, ::std::int32_t field3__arg);

  Foo(Foo&&) = default;

  Foo(const Foo&) = default;


  Foo& operator=(Foo&&) = default;

  Foo& operator=(const Foo&) = default;
 private:
  ::std::int32_t __fbthrift_field_field1;
 private:
  ::std::int32_t __fbthrift_field_field2;
 private:
  ::std::int32_t __fbthrift_field_field3;
 private:
  apache::thrift::detail::isset_bitset<3, apache::thrift::detail::IssetBitsetOption::Unpacked> __isset;

 public:

  bool operator==(const Foo&) const;
  bool operator<(const Foo&) const;

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<const T&> field1_ref() const& {
    return {this->__fbthrift_field_field1, __isset.at(0), __isset.bit(0)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<const T&&> field1_ref() const&& {
    return {static_cast<const T&&>(this->__fbthrift_field_field1), __isset.at(0), __isset.bit(0)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<T&> field1_ref() & {
    return {this->__fbthrift_field_field1, __isset.at(0), __isset.bit(0)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<T&&> field1_ref() && {
    return {static_cast<T&&>(this->__fbthrift_field_field1), __isset.at(0), __isset.bit(0)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<const T&> field1() const& {
    return {this->__fbthrift_field_field1, __isset.at(0), __isset.bit(0)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<const T&&> field1() const&& {
    return {static_cast<const T&&>(this->__fbthrift_field_field1), __isset.at(0), __isset.bit(0)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<T&> field1() & {
    return {this->__fbthrift_field_field1, __isset.at(0), __isset.bit(0)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<T&&> field1() && {
    return {static_cast<T&&>(this->__fbthrift_field_field1), __isset.at(0), __isset.bit(0)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<const T&> field2_ref() const& {
    return {this->__fbthrift_field_field2, __isset.at(1), __isset.bit(1)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<const T&&> field2_ref() const&& {
    return {static_cast<const T&&>(this->__fbthrift_field_field2), __isset.at(1), __isset.bit(1)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<T&> field2_ref() & {
    return {this->__fbthrift_field_field2, __isset.at(1), __isset.bit(1)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<T&&> field2_ref() && {
    return {static_cast<T&&>(this->__fbthrift_field_field2), __isset.at(1), __isset.bit(1)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<const T&> field2() const& {
    return {this->__fbthrift_field_field2, __isset.at(1), __isset.bit(1)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<const T&&> field2() const&& {
    return {static_cast<const T&&>(this->__fbthrift_field_field2), __isset.at(1), __isset.bit(1)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<T&> field2() & {
    return {this->__fbthrift_field_field2, __isset.at(1), __isset.bit(1)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<T&&> field2() && {
    return {static_cast<T&&>(this->__fbthrift_field_field2), __isset.at(1), __isset.bit(1)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<const T&> field3_ref() const& {
    return {this->__fbthrift_field_field3, __isset.at(2), __isset.bit(2)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<const T&&> field3_ref() const&& {
    return {static_cast<const T&&>(this->__fbthrift_field_field3), __isset.at(2), __isset.bit(2)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<T&> field3_ref() & {
    return {this->__fbthrift_field_field3, __isset.at(2), __isset.bit(2)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<T&&> field3_ref() && {
    return {static_cast<T&&>(this->__fbthrift_field_field3), __isset.at(2), __isset.bit(2)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<const T&> field3() const& {
    return {this->__fbthrift_field_field3, __isset.at(2), __isset.bit(2)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<const T&&> field3() const&& {
    return {static_cast<const T&&>(this->__fbthrift_field_field3), __isset.at(2), __isset.bit(2)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<T&> field3() & {
    return {this->__fbthrift_field_field3, __isset.at(2), __isset.bit(2)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<T&&> field3() && {
    return {static_cast<T&&>(this->__fbthrift_field_field3), __isset.at(2), __isset.bit(2)};
  }

  ::std::int32_t get_field1() const {
    return __fbthrift_field_field1;
  }

  [[deprecated("Use `FOO.field1_ref() = BAR;` instead of `FOO.set_field1(BAR);`")]]
  ::std::int32_t& set_field1(::std::int32_t field1_) {
    field1_ref() = field1_;
    return __fbthrift_field_field1;
  }

  ::std::int32_t get_field2() const {
    return __fbthrift_field_field2;
  }

  [[deprecated("Use `FOO.field2_ref() = BAR;` instead of `FOO.set_field2(BAR);`")]]
  ::std::int32_t& set_field2(::std::int32_t field2_) {
    field2_ref() = field2_;
    return __fbthrift_field_field2;
  }

  ::std::int32_t get_field3() const {
    return __fbthrift_field_field3;
  }

  [[deprecated("Use `FOO.field3_ref() = BAR;` instead of `FOO.set_field3(BAR);`")]]
  ::std::int32_t& set_field3(::std::int32_t field3_) {
    field3_ref() = field3_;
    return __fbthrift_field_field3;
  }

  template <class Protocol_>
  unsigned long read(Protocol_* iprot);
  template <class Protocol_>
  uint32_t serializedSize(Protocol_ const* prot_) const;
  template <class Protocol_>
  uint32_t serializedSizeZC(Protocol_ const* prot_) const;
  template <class Protocol_>
  uint32_t write(Protocol_* prot_) const;

 private:
  template <class Protocol_>
  void readNoXfer(Protocol_* iprot);

  friend class ::apache::thrift::Cpp2Ops<Foo>;
  friend void swap(Foo& a, Foo& b);
};

template <class Protocol_>
unsigned long Foo::read(Protocol_* iprot) {
  auto _xferStart = iprot->getCursorPosition();
  readNoXfer(iprot);
  return iprot->getCursorPosition() - _xferStart;
}


class Foo2 final  {
 private:
  friend struct ::apache::thrift::detail::st::struct_private_access;
  template<class> friend struct ::apache::thrift::detail::invoke_reffer;

  //  used by a static_assert in the corresponding source
  static constexpr bool __fbthrift_cpp2_gen_json = false;
  static const folly::StringPiece __fbthrift_get_field_name(::apache::thrift::FieldOrdinal ord);

  void __fbthrift_clear();
  void __fbthrift_clear_terse_fields();
  bool __fbthrift_is_empty() const;

 public:
  using __fbthrift_cpp2_type = Foo2;
  static constexpr bool __fbthrift_cpp2_is_union =
    false;


 public:

  Foo2() :
      __fbthrift_field_field1(),
      __fbthrift_field_field2(),
      __fbthrift_field_field3() {
  }
  // FragileConstructor for use in initialization lists only.
  [[deprecated("This constructor is deprecated")]]
  Foo2(apache::thrift::FragileConstructor, ::std::int32_t field1__arg, ::std::int32_t field2__arg, ::std::int32_t field3__arg);

  Foo2(Foo2&&) = default;

  Foo2(const Foo2&) = default;


  Foo2& operator=(Foo2&&) = default;

  Foo2& operator=(const Foo2&) = default;
 private:
  ::std::int32_t __fbthrift_field_field1;
 private:
  ::std::int32_t __fbthrift_field_field2;
 private:
  ::std::int32_t __fbthrift_field_field3;
 private:
  apache::thrift::detail::isset_bitset<3, apache::thrift::detail::IssetBitsetOption::Unpacked> __isset;

 public:

  bool operator==(const Foo2&) const;
  bool operator<(const Foo2&) const;

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<const T&> field1_ref() const& {
    return {this->__fbthrift_field_field1, __isset.at(0), __isset.bit(0)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<const T&&> field1_ref() const&& {
    return {static_cast<const T&&>(this->__fbthrift_field_field1), __isset.at(0), __isset.bit(0)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<T&> field1_ref() & {
    return {this->__fbthrift_field_field1, __isset.at(0), __isset.bit(0)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<T&&> field1_ref() && {
    return {static_cast<T&&>(this->__fbthrift_field_field1), __isset.at(0), __isset.bit(0)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<const T&> field1() const& {
    return {this->__fbthrift_field_field1, __isset.at(0), __isset.bit(0)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<const T&&> field1() const&& {
    return {static_cast<const T&&>(this->__fbthrift_field_field1), __isset.at(0), __isset.bit(0)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<T&> field1() & {
    return {this->__fbthrift_field_field1, __isset.at(0), __isset.bit(0)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<T&&> field1() && {
    return {static_cast<T&&>(this->__fbthrift_field_field1), __isset.at(0), __isset.bit(0)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<const T&> field2_ref() const& {
    return {this->__fbthrift_field_field2, __isset.at(1), __isset.bit(1)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<const T&&> field2_ref() const&& {
    return {static_cast<const T&&>(this->__fbthrift_field_field2), __isset.at(1), __isset.bit(1)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<T&> field2_ref() & {
    return {this->__fbthrift_field_field2, __isset.at(1), __isset.bit(1)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<T&&> field2_ref() && {
    return {static_cast<T&&>(this->__fbthrift_field_field2), __isset.at(1), __isset.bit(1)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<const T&> field2() const& {
    return {this->__fbthrift_field_field2, __isset.at(1), __isset.bit(1)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<const T&&> field2() const&& {
    return {static_cast<const T&&>(this->__fbthrift_field_field2), __isset.at(1), __isset.bit(1)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<T&> field2() & {
    return {this->__fbthrift_field_field2, __isset.at(1), __isset.bit(1)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<T&&> field2() && {
    return {static_cast<T&&>(this->__fbthrift_field_field2), __isset.at(1), __isset.bit(1)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<const T&> field3_ref() const& {
    return {this->__fbthrift_field_field3, __isset.at(2), __isset.bit(2)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<const T&&> field3_ref() const&& {
    return {static_cast<const T&&>(this->__fbthrift_field_field3), __isset.at(2), __isset.bit(2)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<T&> field3_ref() & {
    return {this->__fbthrift_field_field3, __isset.at(2), __isset.bit(2)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<T&&> field3_ref() && {
    return {static_cast<T&&>(this->__fbthrift_field_field3), __isset.at(2), __isset.bit(2)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<const T&> field3() const& {
    return {this->__fbthrift_field_field3, __isset.at(2), __isset.bit(2)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<const T&&> field3() const&& {
    return {static_cast<const T&&>(this->__fbthrift_field_field3), __isset.at(2), __isset.bit(2)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<T&> field3() & {
    return {this->__fbthrift_field_field3, __isset.at(2), __isset.bit(2)};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<T&&> field3() && {
    return {static_cast<T&&>(this->__fbthrift_field_field3), __isset.at(2), __isset.bit(2)};
  }

  ::std::int32_t get_field1() const {
    return __fbthrift_field_field1;
  }

  [[deprecated("Use `FOO.field1_ref() = BAR;` instead of `FOO.set_field1(BAR);`")]]
  ::std::int32_t& set_field1(::std::int32_t field1_) {
    field1_ref() = field1_;
    return __fbthrift_field_field1;
  }

  ::std::int32_t get_field2() const {
    return __fbthrift_field_field2;
  }

  [[deprecated("Use `FOO.field2_ref() = BAR;` instead of `FOO.set_field2(BAR);`")]]
  ::std::int32_t& set_field2(::std::int32_t field2_) {
    field2_ref() = field2_;
    return __fbthrift_field_field2;
  }

  ::std::int32_t get_field3() const {
    return __fbthrift_field_field3;
  }

  [[deprecated("Use `FOO.field3_ref() = BAR;` instead of `FOO.set_field3(BAR);`")]]
  ::std::int32_t& set_field3(::std::int32_t field3_) {
    field3_ref() = field3_;
    return __fbthrift_field_field3;
  }

  template <class Protocol_>
  unsigned long read(Protocol_* iprot);
  template <class Protocol_>
  uint32_t serializedSize(Protocol_ const* prot_) const;
  template <class Protocol_>
  uint32_t serializedSizeZC(Protocol_ const* prot_) const;
  template <class Protocol_>
  uint32_t write(Protocol_* prot_) const;

 private:
  template <class Protocol_>
  void readNoXfer(Protocol_* iprot);

  friend class ::apache::thrift::Cpp2Ops<Foo2>;
  friend void swap(Foo2& a, Foo2& b);
};

template <class Protocol_>
unsigned long Foo2::read(Protocol_* iprot) {
  auto _xferStart = iprot->getCursorPosition();
  readNoXfer(iprot);
  return iprot->getCursorPosition() - _xferStart;
}


} // cpp2
