Steps

- add dependencies in gradle project and module levels and plugin
- add @HiltAndroidApp annotation to app claas
- add @Inject annotations to classes that want to inject
- add @ApplicationContext annotation to context field in constructor
- create modules for the classes that cannot be construct inject e.g. [ Interfaces ]
- add @AndroidEntryPoint to activity or fragment
- add @HiltViewModel to viewModels
- inject dependency in activity or fragment