
# Speed up Spring Boot startup time

## Step 5 (and last)

*Spring Boot project.*

Replace **basePackages** attribute by **basePackageClasses**.

The advantage is that in refactoring, when moving packages, package reference interface locate where to find Java objects.    
