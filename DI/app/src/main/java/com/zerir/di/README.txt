Steps

- add dependencies in gradle
- add @Inject annotations to classes that want to inject
- create modules for the classes that cannot be construct inject e.g. [ Interfaces, Context ]
- create App Component
- rebuild Project
- Instantiate Dagger inside application class, implement HasAndroidInjector and inject DispatchingAndroidInjection
- Use AndroidInjection.inject in Activity to inject dependency or AndroidSupportInjection.inject in Fragment