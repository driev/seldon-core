## seldon experiment status

get status for experiment

### Synopsis

get status for experiment

```
seldon experiment status [flags]
```

### Options

```
  -e, --experiment-name string   experiment to stop
  -h, --help                     help for status
      --scheduler-host string    seldon scheduler host (default "0.0.0.0")
      --scheduler-port int       seldon scheduler port (default 9004)
  -w, --wait                     wait for experiment to be active
```

### Options inherited from parent commands

```
  -r, --show-request    show request
  -o, --show-response   show response (default true)
```

### SEE ALSO

* [seldon experiment](seldon_experiment.md)	 - manage experiments

###### Auto generated by spf13/cobra on 16-Apr-2022