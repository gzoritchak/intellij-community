android {
  externalNativeBuild {
    ndkBuild {
      path = file("foo/bar/file.txt")
    }
  }
}