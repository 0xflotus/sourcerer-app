// Copyright 2018 Sourcerer Inc. All Rights Reserved.
// Author: Alexander Surkov (alex@sourcerer.io)

package app.extractors

object RustExtractor : ExtractorBase(
    language = Lang.RUST,
    importRegex = Regex("""^extern crate (\w+);$"""),
    commentRegex = Regex("(//.+$)|(/[*].*?[*]/)"))
