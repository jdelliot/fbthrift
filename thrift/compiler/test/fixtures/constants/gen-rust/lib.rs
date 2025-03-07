// @generated by Thrift for thrift/compiler/test/fixtures/constants/src/module.thrift
// This file is probably not the place you want to edit!

#![recursion_limit = "100000000"]
#![allow(non_camel_case_types, non_snake_case, non_upper_case_globals, unused_crate_dependencies, clippy::all)]

pub use self::consts::*;
pub use self::errors::*;
pub use self::types::*;

/// Constant definitions for `module`.
pub mod consts {
    pub const myInt: ::std::primitive::i32 = 1337;

    pub const name: &::std::primitive::str = "Mark Zuckerberg";

    pub const multi_line_string: &::std::primitive::str = "This\nis a\nmulti line string.\n";

    pub static states: ::once_cell::sync::Lazy<::std::vec::Vec<::std::collections::BTreeMap<::std::string::String, ::std::primitive::i32>>> = ::once_cell::sync::Lazy::new(|| vec![
            {
                let mut map = ::std::collections::BTreeMap::new();
                map.insert("San Diego".to_owned(), 3211000);
                map.insert("Sacramento".to_owned(), 479600);
                map.insert("SF".to_owned(), 837400);
                map
            },
            {
                let mut map = ::std::collections::BTreeMap::new();
                map.insert("New York".to_owned(), 8406000);
                map.insert("Albany".to_owned(), 98400);
                map
            },
        ]);

    pub const x: ::std::primitive::f64 = 1.0;

    pub const y: ::std::primitive::f64 = 1000000.0;

    pub const z: ::std::primitive::f64 = 1000000000.0;

    pub const zeroDoubleValue: ::std::primitive::f64 = 0.0;

    pub const longDoubleValue: ::std::primitive::f64 = 2.59961000990301e-05;

    pub const my_company: crate::types::MyCompany = crate::types::Company::FACEBOOK;

    pub const foo: &::std::primitive::str = "foo";

    pub const bar: crate::types::MyIntIdentifier = 42;

    pub static mymap: ::once_cell::sync::Lazy<crate::types::MyMapIdentifier> = ::once_cell::sync::Lazy::new(|| {
            let mut map = ::std::collections::BTreeMap::new();
            map.insert("keys".to_owned(), "values".to_owned());
            map
        });

    pub static instagram: ::once_cell::sync::Lazy<crate::types::Internship> = ::once_cell::sync::Lazy::new(|| crate::types::Internship {
            weeks: 12,
            title: "Software Engineer".to_owned(),
            employer: ::std::option::Option::Some(crate::types::Company::INSTAGRAM),
            compensation: ::std::option::Option::Some(1200.0),
            school: ::std::option::Option::Some("Monters University".to_owned()),
            ..::std::default::Default::default()
        });

    pub static partial_const: ::once_cell::sync::Lazy<crate::types::Internship> = ::once_cell::sync::Lazy::new(|| crate::types::Internship {
            weeks: 8,
            title: "Some Job".to_owned(),
            employer: ::std::default::Default::default(),
            compensation: ::std::default::Default::default(),
            school: ::std::default::Default::default(),
            ..::std::default::Default::default()
        });

    pub static kRanges: ::once_cell::sync::Lazy<::std::vec::Vec<crate::types::Range>> = ::once_cell::sync::Lazy::new(|| vec![
            crate::types::Range {
                min: 1,
                max: 2,
                ..::std::default::Default::default()
            },
            crate::types::Range {
                min: 5,
                max: 6,
                ..::std::default::Default::default()
            },
        ]);

    pub static internList: ::once_cell::sync::Lazy<::std::vec::Vec<crate::types::Internship>> = ::once_cell::sync::Lazy::new(|| vec![
            crate::types::Internship {
                weeks: 12,
                title: "Software Engineer".to_owned(),
                employer: ::std::option::Option::Some(crate::types::Company::INSTAGRAM),
                compensation: ::std::option::Option::Some(1200.0),
                school: ::std::option::Option::Some("Monters University".to_owned()),
                ..::std::default::Default::default()
            },
            crate::types::Internship {
                weeks: 10,
                title: "Sales Intern".to_owned(),
                employer: ::std::option::Option::Some(crate::types::Company::FACEBOOK),
                compensation: ::std::option::Option::Some(1000.0),
                school: ::std::default::Default::default(),
                ..::std::default::Default::default()
            },
        ]);

    pub static pod_0: ::once_cell::sync::Lazy<crate::types::struct1> = ::once_cell::sync::Lazy::new(|| crate::types::struct1 {
            a: 1234567,
            b: "<uninitialized>".to_owned(),
            ..::std::default::Default::default()
        });

    pub static pod_s_0: ::once_cell::sync::Lazy<crate::types::struct1> = ::once_cell::sync::Lazy::new(|| crate::types::struct1 {
            a: 1234567,
            b: "<uninitialized>".to_owned(),
            ..::std::default::Default::default()
        });

    pub static pod_1: ::once_cell::sync::Lazy<crate::types::struct1> = ::once_cell::sync::Lazy::new(|| crate::types::struct1 {
            a: 10,
            b: "foo".to_owned(),
            ..::std::default::Default::default()
        });

    pub static pod_s_1: ::once_cell::sync::Lazy<crate::types::struct1> = ::once_cell::sync::Lazy::new(|| crate::types::struct1 {
            a: 10,
            b: "foo".to_owned(),
            ..::std::default::Default::default()
        });

    pub static pod_2: ::once_cell::sync::Lazy<crate::types::struct2> = ::once_cell::sync::Lazy::new(|| crate::types::struct2 {
            a: 98,
            b: "gaz".to_owned(),
            c: crate::types::struct1 {
                a: 12,
                b: "bar".to_owned(),
                ..::std::default::Default::default()
            },
            d: vec![
                11,
                22,
                33,
            ],
            ..::std::default::Default::default()
        });

    pub static pod_trailing_commas: ::once_cell::sync::Lazy<crate::types::struct2> = ::once_cell::sync::Lazy::new(|| crate::types::struct2 {
            a: 98,
            b: "gaz".to_owned(),
            c: crate::types::struct1 {
                a: 12,
                b: "bar".to_owned(),
                ..::std::default::Default::default()
            },
            d: vec![
                11,
                22,
                33,
            ],
            ..::std::default::Default::default()
        });

    pub static pod_s_2: ::once_cell::sync::Lazy<crate::types::struct2> = ::once_cell::sync::Lazy::new(|| crate::types::struct2 {
            a: 98,
            b: "gaz".to_owned(),
            c: crate::types::struct1 {
                a: 12,
                b: "bar".to_owned(),
                ..::std::default::Default::default()
            },
            d: vec![
                11,
                22,
                33,
            ],
            ..::std::default::Default::default()
        });

    pub static pod_3: ::once_cell::sync::Lazy<crate::types::struct3> = ::once_cell::sync::Lazy::new(|| crate::types::struct3 {
            a: "abc".to_owned(),
            b: 456,
            c: crate::types::struct2 {
                a: 888,
                b: ::std::default::Default::default(),
                c: crate::types::struct1 {
                    a: 1234567,
                    b: "gaz".to_owned(),
                    ..::std::default::Default::default()
                },
                d: vec![
                    1,
                    2,
                    3,
                ],
                ..::std::default::Default::default()
            },
            ..::std::default::Default::default()
        });

    pub static pod_s_3: ::once_cell::sync::Lazy<crate::types::struct3> = ::once_cell::sync::Lazy::new(|| crate::types::struct3 {
            a: "abc".to_owned(),
            b: 456,
            c: crate::types::struct2 {
                a: 888,
                b: ::std::default::Default::default(),
                c: crate::types::struct1 {
                    a: 1234567,
                    b: "gaz".to_owned(),
                    ..::std::default::Default::default()
                },
                d: vec![
                    1,
                    2,
                    3,
                ],
                ..::std::default::Default::default()
            },
            ..::std::default::Default::default()
        });

    pub static pod_4: ::once_cell::sync::Lazy<crate::types::struct4> = ::once_cell::sync::Lazy::new(|| crate::types::struct4 {
            a: 1234,
            b: ::std::option::Option::Some(0.333),
            c: ::std::option::Option::Some(25),
            ..::std::default::Default::default()
        });

    pub static u_1_1: ::once_cell::sync::Lazy<crate::types::union1> = ::once_cell::sync::Lazy::new(|| crate::types::union1::i(97));

    pub static u_1_2: ::once_cell::sync::Lazy<crate::types::union1> = ::once_cell::sync::Lazy::new(|| crate::types::union1::d(5.6));

    pub static u_1_3: ::once_cell::sync::Lazy<crate::types::union1> = ::once_cell::sync::Lazy::new(|| crate::types::union1::default());

    pub static u_2_1: ::once_cell::sync::Lazy<crate::types::union2> = ::once_cell::sync::Lazy::new(|| crate::types::union2::i(51));

    pub static u_2_2: ::once_cell::sync::Lazy<crate::types::union2> = ::once_cell::sync::Lazy::new(|| crate::types::union2::d(6.7));

    pub static u_2_3: ::once_cell::sync::Lazy<crate::types::union2> = ::once_cell::sync::Lazy::new(|| crate::types::union2::s(crate::types::struct1 {
                a: 8,
                b: "abacabb".to_owned(),
                ..::std::default::Default::default()
            }));

    pub static u_2_4: ::once_cell::sync::Lazy<crate::types::union2> = ::once_cell::sync::Lazy::new(|| crate::types::union2::u(crate::types::union1::i(43)));

    pub static u_2_5: ::once_cell::sync::Lazy<crate::types::union2> = ::once_cell::sync::Lazy::new(|| crate::types::union2::u(crate::types::union1::d(9.8)));

    pub static u_2_6: ::once_cell::sync::Lazy<crate::types::union2> = ::once_cell::sync::Lazy::new(|| crate::types::union2::u(crate::types::union1::default()));

    pub const apostrophe: &::std::primitive::str = "'";

    pub const tripleApostrophe: &::std::primitive::str = "'''";

    pub const quotationMark: &::std::primitive::str = "\"";

    pub const backslash: &::std::primitive::str = "\\";

    pub const escaped_a: &::std::primitive::str = "a";

    pub static char2ascii: ::once_cell::sync::Lazy<::std::collections::BTreeMap<::std::string::String, ::std::primitive::i32>> = ::once_cell::sync::Lazy::new(|| {
            let mut map = ::std::collections::BTreeMap::new();
            map.insert("'".to_owned(), 39);
            map.insert("\"".to_owned(), 34);
            map.insert("\\".to_owned(), 92);
            map.insert("a".to_owned(), 97);
            map
        });

    pub static escaped_strings: ::once_cell::sync::Lazy<::std::vec::Vec<::std::string::String>> = ::once_cell::sync::Lazy::new(|| vec![
            "".to_owned(),
            "".to_owned(),
            " ".to_owned(),
            "'".to_owned(),
            "\"".to_owned(),
            "\n".to_owned(),
            "\r".to_owned(),
            "\t".to_owned(),
            "a".to_owned(),
            "«".to_owned(),
            "j".to_owned(),
            "¦".to_owned(),
            "ayyy".to_owned(),
            "«yyy".to_owned(),
            "jyyy".to_owned(),
            "¦yyy".to_owned(),
            "zzza".to_owned(),
            "zzz«".to_owned(),
            "zzzj".to_owned(),
            "zzz¦".to_owned(),
            "zzzayyy".to_owned(),
            "zzz«yyy".to_owned(),
            "zzzjyyy".to_owned(),
            "zzz¦yyy".to_owned(),
        ]);

    pub const false_c: ::std::primitive::bool = false;

    pub const true_c: ::std::primitive::bool = true;

    pub const zero_byte: ::std::primitive::i8 = 0;

    pub const zero16: ::std::primitive::i16 = 0;

    pub const zero32: ::std::primitive::i32 = 0;

    pub const zero64: ::std::primitive::i64 = 0;

    pub const zero_dot_zero: ::std::primitive::f64 = 0.0;

    pub const empty_string: &::std::primitive::str = "";

    pub static empty_int_list: ::once_cell::sync::Lazy<::std::vec::Vec<::std::primitive::i32>> = ::once_cell::sync::Lazy::new(|| ::std::vec::Vec::new());

    pub static empty_string_list: ::once_cell::sync::Lazy<::std::vec::Vec<::std::string::String>> = ::once_cell::sync::Lazy::new(|| ::std::vec::Vec::new());

    pub static empty_int_set: ::once_cell::sync::Lazy<::std::collections::BTreeSet<::std::primitive::i32>> = ::once_cell::sync::Lazy::new(|| ::std::collections::BTreeSet::new());

    pub static empty_string_set: ::once_cell::sync::Lazy<::std::collections::BTreeSet<::std::string::String>> = ::once_cell::sync::Lazy::new(|| ::std::collections::BTreeSet::new());

    pub static empty_int_int_map: ::once_cell::sync::Lazy<::std::collections::BTreeMap<::std::primitive::i32, ::std::primitive::i32>> = ::once_cell::sync::Lazy::new(|| ::std::collections::BTreeMap::new());

    pub static empty_int_string_map: ::once_cell::sync::Lazy<::std::collections::BTreeMap<::std::primitive::i32, ::std::string::String>> = ::once_cell::sync::Lazy::new(|| ::std::collections::BTreeMap::new());

    pub static empty_string_int_map: ::once_cell::sync::Lazy<::std::collections::BTreeMap<::std::string::String, ::std::primitive::i32>> = ::once_cell::sync::Lazy::new(|| ::std::collections::BTreeMap::new());

    pub static empty_string_string_map: ::once_cell::sync::Lazy<::std::collections::BTreeMap<::std::string::String, ::std::string::String>> = ::once_cell::sync::Lazy::new(|| ::std::collections::BTreeMap::new());

    pub const maxIntDec: ::std::primitive::i64 = 9223372036854775807;

    pub const maxIntOct: ::std::primitive::i64 = 9223372036854775807;

    pub const maxIntHex: ::std::primitive::i64 = 9223372036854775807;

    pub const maxIntBin: ::std::primitive::i64 = 9223372036854775807;

    pub const maxDub: ::std::primitive::f64 = 1.7976931348623157e+308;

    pub const minDub: ::std::primitive::f64 = 2.2250738585072014e-308;

    pub const minSDub: ::std::primitive::f64 = 5e-324;

    pub const maxPIntDec: ::std::primitive::i64 = 9223372036854775807;

    pub const maxPIntOct: ::std::primitive::i64 = 9223372036854775807;

    pub const maxPIntHex: ::std::primitive::i64 = 9223372036854775807;

    pub const maxPIntBin: ::std::primitive::i64 = 9223372036854775807;

    pub const maxPDub: ::std::primitive::f64 = 1.7976931348623157e+308;

    pub const minPDub: ::std::primitive::f64 = 2.2250738585072014e-308;

    pub const minPSDub: ::std::primitive::f64 = 5e-324;

    pub const minIntDec: ::std::primitive::i64 = -9223372036854775808;

    pub const minIntOct: ::std::primitive::i64 = -9223372036854775808;

    pub const minIntHex: ::std::primitive::i64 = -9223372036854775808;

    pub const minIntBin: ::std::primitive::i64 = -9223372036854775808;

    pub const maxNDub: ::std::primitive::f64 = -1.7976931348623157e+308;

    pub const minNDub: ::std::primitive::f64 = -2.2250738585072014e-308;

    pub const minNSDub: ::std::primitive::f64 = -5e-324;

}

pub use :: as types;

/// Error return types.
pub mod errors {
}
