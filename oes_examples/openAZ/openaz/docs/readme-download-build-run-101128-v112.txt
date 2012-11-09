
!********************

    11/28/10:

	The following instructions are pretty much unchanged
	from earlier versions, but consolidated and include
	both OpenAzTutorial and TestStyles:

	After download and unzip, the instructions that follow below
	basically reduce to the executing the 
	following 8 lines to a command prompt:

cd \Notes\Downloads\Openaz\V112
cd openaz\test\build
ant clean
ant
cd \Notes\Downloads\OpenAz\V112\openaz\test\bin
set baseline=C:\Notes\Downloads\OpenAz\V112\openaz
java -cp .;%baseline%\pep\bin;%baseline%\pdp\bin;%baseline%\azapi\bin;%baseline%\lib\jakarta-commons\commons-logging.jar;%baseline%\pdp\lib\sunxacml.jar tutorial.OpenAzTutorial  %baseline%\test\policy\OpenAz-Pseudo-Test-Policy.txt
java -cp .;%baseline%\pep\bin;%baseline%\pdp\bin;%baseline%\azapi\bin;%baseline%\lib\jakarta-commons\commons-logging.jar;%baseline%\pdp\lib\sunxacml.jar  test.TestStyles %baseline%\test\request\sensitive.xml    %baseline%\test\policy\TestAzApi-GeneratedPolicy.xml


***********************!


  Go to:

	http://openaz.svn.sourceforge.net/viewvc/openaz/

  At bottom of page click on Download GNU tarball and specify
    directory where zip file will be loaded, for example:

	C:\Notes\Downloads\OpenAz\V112

  Refer to the above directory as:

	<TOPOFPROJECT>

  Go to <TOPOFPROJECT>

C:
cd \Notes\Downloads\Openaz\V112

  Unzip the tarball in place (need to do it twice, for example,
   using 7-zip, while in <TOPOFPROJECT> do "Extract here" twice):
    1. openaz.tar.gz extracts to openaz.tar
    2. openaz.tar extracts to openaz directory, which has
	absolute path:
	 <TOPOFPROJECT>\openaz
	or:
	 C:\Notes\Downloads\OpenAz\V112\openaz

  At this point all the files should be unzipped in
    (where "\-" means all descendants):

	<TOPOFPROJECT>\openaz\-

  To build the project, the following should work from the
    command prompt:

cd <TOPOFPROJECT>
cd openaz\test\build
ant clean
ant

  After ant clean, should get:

	...
	BUILD SUCCESSFUL
	Total time: 0 seconds

  After ant, should also get:

	...
	BUILD SUCCESSFUL
	Total time: 6 seconds

  To run tutorial go to following dir and set baseline:

	cd <TOPOFPROJECT>\openaz\test\bin
	set baseline=<TOPOFPROJECT>\openaz

cd \Notes\Downloads\OpenAz\V112\openaz\test\bin

set baseline=C:\Notes\Downloads\OpenAz\V112\openaz

  Execute following java command:

java -cp .;%baseline%\pep\bin;%baseline%\pdp\bin;%baseline%\azapi\bin;%baseline%\lib\jakarta-commons\commons-logging.jar;%baseline%\pdp\lib\sunxacml.jar tutorial.OpenAzTutorial  %baseline%\test\policy\OpenAz-Pseudo-Test-Policy.txt


  To run TestStyles and other test programs (an extra cmd line parameter is needed):

java -cp .;%baseline%\pep\bin;%baseline%\pdp\bin;%baseline%\azapi\bin;%baseline%\lib\jakarta-commons\commons-logging.jar;%baseline%\pdp\lib\sunxacml.jar  test.TestStyles %baseline%\test\request\sensitive.xml    %baseline%\test\policy\TestAzApi-GeneratedPolicy.xml


