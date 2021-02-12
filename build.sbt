lazy val generated = project.in(file("generated"))
  .settings(
    openApiInputSpec := "swagger.yaml",
    openApiConfigFile := "config.yml",
    openApiValidateSpec := SettingEnabled,
    openApiGenerateModelTests := SettingDisabled
  )
