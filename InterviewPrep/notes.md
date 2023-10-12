"default" classes are only accesible within the same package.
"private" can only be applied to subclasses and are only accesible within the file in which they are declared.
"public" classes are accesible everywhere even outside the package they reside in.
"protected" is a bit complicated. If we try to access protected members from the a class in the same package it will work but if we try to access it from a class in a different package it won't. Even objects made in classes not in the same package will not access to their own protected methods and variables.



