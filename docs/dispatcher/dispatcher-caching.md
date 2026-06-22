# Dispatcher Caching and Filters

Dispatcher improves performance and protects publish instances.

## Responsibilities

- Cache static and HTML content.
- Block sensitive paths.
- Allow only required content and clientlib paths.
- Invalidate cache after content activation.

```mermaid
sequenceDiagram
    participant U as User
    participant D as Dispatcher
    participant P as AEM Publish
    U->>D: Request page
    alt Cached
        D-->>U: Return cached page
    else Not cached
        D->>P: Fetch page
        P-->>D: Response
        D-->>U: Cache and return
    end
```
