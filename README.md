# Reproduction project

This project demonstrates the issue described in

Essentially, the Spring Data REST repository mappings do not coexist cleanly
with base Web MVC mappings. When an `@RestController` is manually mapped to
the same URL as an HTML controller, where the latter has a
`produces="text/html"` directive, the dispatcher will perform content
negotiation and return the preferred representation. When the conflicting
mapping is a Spring Data REST mapping, however, the dispatcher servlet returns
a 406 Not Acceptable instead of using the `/api/{repository}/{id}` mapping.
