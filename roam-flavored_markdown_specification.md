# Roam-Flavored Markdown Specification

## Contents

## Standard Markdown

### Heading 1

    `# This is a heading`

### Heading 2

    `## This `

### Heading 3

### Bold

### Italic

### Strikethrough

### Highlight

### Blockquote

### Link

### Short Link

### Images

### Inline Code

### Code Block

## Roam-Specific

### Page Ref

Example

`This creates a link to a page called [[foo]]`

Creates a link to some page called `foo`. If the page `foo` does not already 
exist, it is created.

### Block Ref

`((34h9sj3l))`

### Widget

- `{{[[TODO]]}}`
- `{{[[DONE]]}}`
- `{{embed: ((jlkjl))}}`
- `{{table: ((lkdjfl))}}`
- `{{query: {and: [[todo]] {or: [[foo]] [[bar]]}}}}`
- `{{attr-table: ((lkjflaka))}}`
- `{{pdf: url}}`
- `{{word-count}}`
- `{{character-count}}`
- `{{or: [[foo]] [[bar]] [[baz]]}}`
- `{{diagram}}`
- `{{version-control}}`
- `{{orphans}}`
- `{{slider}}`
- `{{alias}}`
- `{{mentions: [[foo]]}}`
- `{{database}}`
- `{{view}}`
- `{{video: url}}`
- `{{pomo: 25}}`
- `{{timer}}`
- `{{youtube: url}}`
- `{{calc: 1 + 2}}`
- `{{kanban}}`
- `{{cartesian}}`
- `{{encrypt}}`
- `{{iframe: url}}`
- `{{theme-selector}}`
- `{{TaoOfRoam}}`
- `{{audio: url}}`
- `{{spotify}}`
- `{{mermaid}}`
- `{{insect}}`
- `{{drawing}}`
- `{{roam/js}}`
- `{{∆}}`
- `{{roam/render ((lkjlkj))}}`
- `{{test}}`
- `{{inline}}`
- `{{claims}}`
- `{{a}}`
- `{{string}}`
- `{{count}}`
- `{{e}}`

### Tag

`#foo`

### Multitag

`#[[foo bar]]`

### Attributes

`foo::`

### Latex

```
$$
\frac{arg 1}{arg 2}	
$$
```

### Code Block

~~~
```javascript
   foo()
```
~~~
